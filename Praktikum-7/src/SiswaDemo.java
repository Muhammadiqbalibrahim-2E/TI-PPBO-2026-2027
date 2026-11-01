public class SiswaDemo {
    public static void main(String[] args) {

        Siswa siswa1 = new Siswa(90);

        System.out.println("=== NILAI AWAL ===");
        siswa1.tampilkanNilai();

        // Mengubah nilai
        siswa1.setNilai(78);

        System.out.println("\n=== SETELAH NILAI DIUBAH ===");
        siswa1.tampilkanNilai();

        // Menguji validasi
        System.out.println("\n=== PENGUJIAN VALIDASI ===");
        siswa1.setNilai(120);

        System.out.println("\n=== NILAI AKHIR ===");
        siswa1.tampilkanNilai();
    }
}