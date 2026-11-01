public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    // Constructor
    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;

        setHarga(harga);

        if (stok >= 0) {
            this.stok = stok;
        } else {
            this.stok = 0;
            System.out.println("Stok awal tidak boleh negatif!");
        }
    }

    // Getter
    public String getKodeProduk() {
        return kodeProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Setter harga dengan validasi
    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak boleh negatif!");
        }
    }

    // Menambah stok
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
            System.out.println("Stok berhasil ditambahkan.");
        } else {
            System.out.println("Jumlah penambahan harus lebih dari 0!");
        }
    }

    // Mengurangi stok
    public void kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah pengurangan harus lebih dari 0!");
        } else if (jumlah > stok) {
            System.out.println("Stok tidak mencukupi!");
        } else {
            stok -= jumlah;
            System.out.println("Stok berhasil dikurangi.");
        }
    }

    // Menampilkan data produk
    public void tampilkanProduk() {
        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : Rp" + harga);
        System.out.println("Stok        : " + stok);
    }
}