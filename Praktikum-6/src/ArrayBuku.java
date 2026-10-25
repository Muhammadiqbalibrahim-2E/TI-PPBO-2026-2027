public class ArrayBuku {
    public static void main(String[] args) {
        Buku[] daftarBuku = new Buku[4];

        daftarBuku[0] = new Buku(
                "Laskar Pelangi",
                "Andrea Hirata",
                2005
        );

        daftarBuku[1] = new Buku(
                "Bumi",
                "Tere Liye",
                2014
        );

        daftarBuku[2] = new Buku(
                "Selena",
                "Tere Liye",
                2020
        );

        daftarBuku[3] = new Buku(
                "Laut Bercerita",
                "Leila S. Chudori",
                2017
        );

        System.out.println("Buku terbit setelah tahun 2015:");

        for (Buku buku : daftarBuku) {
            if (buku.tahunTerbit > 2015) {
                System.out.println(
                        buku.judul + " - " + buku.tahunTerbit
                );
            }
        }
    }
}
