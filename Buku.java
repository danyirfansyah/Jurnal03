public class Buku {
    private String judul;
    private String penulis;
    private String tahun;

    public Buku(String judul, String penulis, String tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }

    public String getJudul() {
        return judul;
    }

    @Override
    public String toString() {
        return "Buku [judul=" + judul + ", penulis=" + penulis + ", tahun=" + tahun + "]";
    }

}
