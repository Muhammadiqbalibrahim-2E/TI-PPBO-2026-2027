public class LatihanProduk {
    public static void main(String[] args) {
        Produk produk1 = new Produk("Laptop", 8000000);
        Produk produk2 = new Produk("Mouse", 150000);

        double batasHarga = 1000000;

        System.out.println(
                produk1.namaProduk + " mahal? "
                        + produk1.isMahal(batasHarga)
        );

        System.out.println(
                produk2.namaProduk + " mahal? "
                        + produk2.isMahal(batasHarga)
        );
    }
}
