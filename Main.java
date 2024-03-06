import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        SinglyLinkedList list1 = new SinglyLinkedList();
        int pilihan;
        String yesOrNo;

        while (true) {
            System.out.println("Tambah Buku");
            System.out.println("Hapus Buku");
            System.out.println("Cetak Daftar Buku");
            System.out.println("Keluar");
            pilihan = input1.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Judul Buku: ");
                String judulBuku = input1.next();
                System.out.print("Masukkan Penulis: ");
                String penulis = input1.next();
                System.out.print("Masukkan Tahun Terbit: ");
                String tahunTerbit = input1.next();

                System.out.println("Tambahan data di awal list? (y/n)");
                yesOrNo = input1.next();

                if (yesOrNo.equals("y")) {
                    list1.insertAtFront(new Buku(judulBuku, penulis, tahunTerbit));
                } else {
                    list1.insertAtBack(new Buku(judulBuku, penulis, tahunTerbit));
                }
                break;
            case 2:
                System.out.println("Hapus data di awal list? (y/n)");
                yesOrNo = input1.next();

                if (yesOrNo.equals("y")) {
                    list1.removeFromFront();
                    System.out.println("Data buku di awal list berhasil dihapus");
                } else {
                    list1.removeFromBack();
                    System.out.println("Data buku di akhir list berhasil dihapus");
                }
                break;
            case 3:
                System.out.println("List buku adalah:");
                list1.print();
                break;
            }
        }
    }
}
