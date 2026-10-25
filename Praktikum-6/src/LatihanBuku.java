public class LatihanBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku(
                "Laskar Pelangi",
                "Andrea Hirata",
                2005
        );

        Buku buku2 = new Buku(
                "Bumi",
                "Tere Liye",
                2014
        );

        buku1.tampilkanData();
        System.out.println();

        buku2.tampilkanData();
    }
}
