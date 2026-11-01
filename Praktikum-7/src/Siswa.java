public class Siswa {
    private double nilai;

    // Constructor
    public Siswa(double nilai) {
        setNilai(nilai);
    }

    // Getter
    public double getNilai() {
        return nilai;
    }

    // Setter dengan validasi
    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai harus berada di antara 0 sampai 100!");
        }
    }

    // Menentukan nilai huruf
    public String getNilaiHuruf() {
        if (nilai >= 85) {
            return "A";
        } else if (nilai >= 75) {
            return "B";
        } else if (nilai >= 65) {
            return "C";
        } else if (nilai >= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    // Menampilkan data siswa
    public void tampilkanNilai() {
        System.out.println("Nilai Angka : " + nilai);
        System.out.println("Nilai Huruf : " + getNilaiHuruf());
    }
}