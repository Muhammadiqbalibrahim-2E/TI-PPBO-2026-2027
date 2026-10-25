public class Buku {
    String judul;
    String pengarang;
    int tahunTerbit;

    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilkanData() {
        System.out.println("Judul          : " + judul);
        System.out.println("Pengarang      : " + pengarang);
        System.out.println("Tahun Terbit   : " + tahunTerbit);
    }
}
