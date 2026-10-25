public class ArrayPersegi {
    public static void main(String[] args) {
        Persegi[] daftar = new Persegi[4];

        daftar[0] = new Persegi(5);
        daftar[1] = new Persegi(8);
        daftar[2] = new Persegi(12);
        daftar[3] = new Persegi(7);

        Persegi terbesar = daftar[0];

        for (Persegi p : daftar) {
            if (p.hitungLuas() > terbesar.hitungLuas()) {
                terbesar = p;
            }
        }

        System.out.println("Persegi dengan luas terbesar");
        System.out.println("Sisi : " + terbesar.sisi);
        System.out.println("Luas : " + terbesar.hitungLuas());
    }
}
