public class TokoDemo {
    public static void main(String[] args) {
        Produk[] daftarProduk = new Produk[5];

        daftarProduk[0] = new Produk(
                "P001", "Laptop", 8000000, 5
        );

        daftarProduk[1] = new Produk(
                "P002", "Mouse", 150000, 10
        );

        daftarProduk[2] = new Produk(
                "P003", "Keyboard", 350000, 8
        );

        daftarProduk[3] = new Produk(
                "P004", "Monitor", 2500000, 4
        );

        daftarProduk[4] = new Produk(
                "P005", "Headset", 500000, 6
        );

        System.out.println("=== DAFTAR PRODUK ===");

        for (Produk produk : daftarProduk) {
            produk.tampilkanData();
            System.out.println("--------------------");
        }

        System.out.println("\n=== PEMBELIAN 1 ===");

        int jumlahBeli1 = 2;

        System.out.println(
                "Produk : " + daftarProduk[0].namaProduk
        );

        System.out.println(
                "Total Harga : Rp" +
                daftarProduk[0].hitungTotalHarga(jumlahBeli1)
        );

        daftarProduk[0].kurangiStok(jumlahBeli1);

        System.out.println(
                "Sisa Stok : " + daftarProduk[0].stok
        );

        System.out.println("\n=== PEMBELIAN 2 ===");

        int jumlahBeli2 = 20;

        System.out.println(
                "Produk : " + daftarProduk[1].namaProduk
        );

        System.out.println(
                "Total Harga : Rp" +
                daftarProduk[1].hitungTotalHarga(jumlahBeli2)
        );

        daftarProduk[1].kurangiStok(jumlahBeli2);

        System.out.println(
                "Sisa Stok : " + daftarProduk[1].stok
        );

        Produk termahal = daftarProduk[0];

        for (Produk produk : daftarProduk) {
            if (produk.harga > termahal.harga) {
                termahal = produk;
            }
        }

        System.out.println("\n=== PRODUK TERMAHAL ===");
        termahal.tampilkanData();
    }
}
