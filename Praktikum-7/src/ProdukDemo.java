public class ProdukDemo {
    public static void main(String[] args) {

        Produk produk1 = new Produk(
                "P001",
                "Keyboard",
                150000,
                20
        );

        System.out.println("=== DATA PRODUK AWAL ===");
        produk1.tampilkanProduk();

        // Mengubah harga
        System.out.println("\n=== MENGUBAH HARGA ===");
        produk1.setHarga(175000);

        // Menambah stok
        System.out.println("\n=== MENAMBAH STOK ===");
        produk1.tambahStok(10);

        // Mengurangi stok
        System.out.println("\n=== MENGURANGI STOK ===");
        produk1.kurangiStok(5);

        System.out.println("\n=== DATA PRODUK TERBARU ===");
        produk1.tampilkanProduk();

        // Menguji validasi
        System.out.println("\n=== PENGUJIAN VALIDASI ===");
        produk1.setHarga(-50000);
        produk1.tambahStok(-5);
        produk1.kurangiStok(100);

        System.out.println("\n=== DATA PRODUK AKHIR ===");
        produk1.tampilkanProduk();
    }
}