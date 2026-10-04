import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // KKM dapat diubah sesuai kebutuhan
        int KKM = 70;

        // Meminta jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
            sc.close();
            return;
        }

        // Membuat array nilai sesuai jumlah mahasiswa
        int[] nilai = new int[n];

        // Membaca nilai setiap mahasiswa menggunakan for loop
        System.out.println("\n=== INPUT NILAI MAHASISWA ===");

        for (int i = 0; i < n; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        // Menampilkan array sebelum diurutkan
        System.out.println("\n=== NILAI SEBELUM DIURUTKAN ===");

        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }

        // Inisialisasi nilai maksimum dan minimum
        int tertinggi = nilai[0];
        int terendah = nilai[0];

        // Menghitung total, nilai tertinggi, nilai terendah,
        // jumlah mahasiswa lulus dan tidak lulus
        int total = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < nilai.length; i++) {

            total += nilai[i];

            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }

            if (nilai[i] >= KKM) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        // Menghitung rata-rata kelas
        double rataRata = (double) total / nilai.length;

        // Bubble sort ascending secara manual
        for (int i = 0; i < nilai.length - 1; i++) {

            for (int j = 0; j < nilai.length - 1 - i; j++) {

                if (nilai[j] > nilai[j + 1]) {

                    // Menukar posisi dua nilai
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        // Menampilkan array sesudah diurutkan
        System.out.println("\n\n=== NILAI SESUDAH DIURUTKAN ===");

        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }

        // Menampilkan laporan hasil pengolahan
        System.out.println("\n\n========================================");
        System.out.println("       LAPORAN PENGOLAHAN NILAI");
        System.out.println("========================================");
        System.out.println("Jumlah mahasiswa       : " + n);
        System.out.println("KKM                    : " + KKM);
        System.out.println("Nilai rata-rata kelas  : " + rataRata);
        System.out.println("Nilai tertinggi        : " + tertinggi);
        System.out.println("Nilai terendah         : " + terendah);
        System.out.println("Jumlah mahasiswa lulus : " + jumlahLulus);
        System.out.println("Jumlah tidak lulus     : " + jumlahTidakLulus);
        System.out.println("========================================");

        sc.close();
    }
}
