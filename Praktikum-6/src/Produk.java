public class Produk {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    public Produk(String namaProduk, double harga) {
        this("", namaProduk, harga, 0);
    }

    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public double hitungTotalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }

    public void kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
            System.out.println("Pembelian berhasil");
        } else {
            System.out.println("Stok tidak mencukupi");
        }
    }

    public void tampilkanData() {
        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : Rp" + harga);
        System.out.println("Stok        : " + stok);
    }

    public boolean isMahal(double batasHarga) {
        return harga > batasHarga;
    }
}
