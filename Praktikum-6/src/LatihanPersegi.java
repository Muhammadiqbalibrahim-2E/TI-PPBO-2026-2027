public class LatihanPersegi {
    public static void main(String[] args) {
        Persegi p1 = new Persegi(5);
        Persegi p2 = new Persegi(8);
        Persegi p3 = new Persegi(10);

        System.out.println("Persegi 1");
        System.out.println("Luas     : " + p1.hitungLuas());
        System.out.println("Keliling : " + p1.hitungKeliling());

        System.out.println();

        System.out.println("Persegi 2");
        System.out.println("Luas     : " + p2.hitungLuas());
        System.out.println("Keliling : " + p2.hitungKeliling());

        System.out.println();

        System.out.println("Persegi 3");
        System.out.println("Luas     : " + p3.hitungLuas());
        System.out.println("Keliling : " + p3.hitungKeliling());
    }
}
