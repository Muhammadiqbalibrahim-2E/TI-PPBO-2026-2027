public class BukuDemo {
    public static void main(String[] args) {

        Buku buku1 = new Buku(
                "Pemrograman Java",
                "Budi Santoso",
                2024
        );

        System.out.println("=== DATA BUKU AWAL ===");
        buku1.tampilkanData();

        // Mengubah judul
        buku1.setJudul("Belajar Java OOP");

        // Mengubah pengarang
        buku1.setPengarang("Muhammad Iqbal");

        System.out.println("\n=== DATA BUKU SETELAH DIUBAH ===");
        buku1.tampilkanData();
    }
}