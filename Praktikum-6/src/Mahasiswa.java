public class Mahasiswa {
    String nama;
    String nim;
    double ipk;

    // Constructor default
    public Mahasiswa() {
        nama = "Belum diisi";
        nim = "-";
        ipk = 0.0;
    }

    // Constructor dengan parameter
    public Mahasiswa(String namaAwal, String nimAwal, double ipkAwal) {
        nama = namaAwal;
        nim = nimAwal;
        ipk = ipkAwal;
    }
}
