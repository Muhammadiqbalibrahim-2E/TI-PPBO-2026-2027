public class WaktuDemo {
    public static void main(String[] args) {

        Waktu waktu1 = new Waktu(10, 30, 45);

        System.out.println("=== WAKTU AWAL ===");
        waktu1.tampilkanWaktu();

        // Mengubah waktu dengan nilai valid
        waktu1.setJam(15);
        waktu1.setMenit(45);
        waktu1.setDetik(50);

        System.out.println("\n=== WAKTU SETELAH DIUBAH ===");
        waktu1.tampilkanWaktu();

        // Menguji validasi
        System.out.println("\n=== PENGUJIAN VALIDASI ===");
        waktu1.setJam(25);
        waktu1.setMenit(70);
        waktu1.setDetik(80);

        System.out.println("\n=== WAKTU AKHIR ===");
        waktu1.tampilkanWaktu();
    }
}