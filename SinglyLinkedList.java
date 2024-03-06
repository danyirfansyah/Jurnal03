import java.util.NoSuchElementException;

public class SinglyLinkedList {
    private ListNode firstNode;
    private ListNode lastNode;
    private String name;

    public SinglyLinkedList() {
        this("linked list");
    }

    public SinglyLinkedList(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    public void insertAtFront (Buku insertItem) {
        ListNode newNode = new ListNode(insertItem);

        if (isEmpty()) {
            firstNode = lastNode = new ListNode(insertItem);
        } else {
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }

    public void insertAtBack (Buku insertItem) {
        ListNode newNode = new ListNode(insertItem);

        if (isEmpty()) {
            firstNode = lastNode = new ListNode(insertItem);
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }

    public Buku removeFromBack() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(name + " is empty");
        }

        Buku removedItem = lastNode.data;

        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            ListNode current = firstNode;

            while (current.next != lastNode) {
                current.next = null;
            }

            lastNode = current;
            current.next = null;
        }

        return removedItem;
    }

    public Buku removeFromFront() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(name + " is empty");
        }

        Buku removedItem = firstNode.data;

        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.next;
        }
        return removedItem;
    
    }
    
    private boolean isEmpty() {
            return firstNode == null;
        }
        

    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", name);
            return;
        }
        System.out.printf("The %s is: %n", name);
        ListNode current = firstNode;
        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.next;
        }
        System.out.println();
    }


    
    
}