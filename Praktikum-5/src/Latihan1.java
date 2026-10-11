public class Latihan1 {
    // Luas persegi panjang
    public static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }

    // Luas lingkaran
    public static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        System.out.println("Luas Persegi Panjang (p=5, l=3): " + luasPersegiPanjang(5, 3));
        System.out.println("Luas Persegi Panjang (p=10, l=2.5): " + luasPersegiPanjang(10, 2.5));
        System.out.println("Luas Lingkaran (r=7): " + luasLingkaran(7));
        System.out.println("Luas Lingkaran (r=3.5): " + luasLingkaran(3.5));
    }
}
