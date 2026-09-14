import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args) {
        // 1. Membuat konstanta tarif per kWh untuk setiap golongan
        final double TARIF_450 = 415.0;
        final double TARIF_900 = 1352.0;
        final double TARIF_1300 = 1444.70;
        final double TARIF_2200 = 1444.70;
        final double TARIF_DI_ATAS_2200 = 1699.53;

        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM HITUNG TARIF LISTRIK ===");

        // 2. Membaca input golongan daya listrik
        System.out.print("Masukkan golongan daya listrik pelanggan dalam VA (450/900/1300/2200/3000): ");
        int golonganDaya = input.nextInt();

        // 3. Membaca input jumlah pemakaian listrik dalam kWh
        System.out.print("Masukkan jumlah pemakaian listrik (kWh): ");
        double pemakaianKwh = input.nextDouble();

        // 4. Validasi menggunakan operator logika (Menolak jika kWh bernilai negatif atau nol)
        if (pemakaianKwh < 0 || pemakaianKwh == 0) {
            System.out.println("\n[ERROR] Input kWh tidak valid! Jumlah pemakaian harus lebih besar dari nol.");
        } else {
            double tarifPerKwh = 0;
            boolean golonganValid = true;
            String namaGolongan = "";

            // 5. Menentukan tarif berdasarkan golongan menggunakan switch-case
            switch (golonganDaya) {
                case 450:
                    tarifPerKwh = TARIF_450;
                    namaGolongan = "450 VA";
                    break;
                case 900:
                    tarifPerKwh = TARIF_900;
                    namaGolongan = "900 VA";
                    break;
                case 1300:
                    tarifPerKwh = TARIF_1300;
                    namaGolongan = "1300 VA";
                    break;
                case 2200:
                    tarifPerKwh = TARIF_2200;
                    namaGolongan = "2200 VA";
                    break;
                default:
                    // Jika input di atas 2200
                    if (golonganDaya > 2200) {
                        tarifPerKwh = TARIF_DI_ATAS_2200;
                        namaGolongan = "Di atas 2200 VA (" + golonganDaya + " VA)";
                    } else {
                        System.out.println("\n[ERROR] Golongan daya tidak dikenali!");
                        golonganValid = false;
                    }
                    break;
            }

            // Jika golongan daya valid, hitung total dan tampilkan hasil akhir
            if (golonganValid) {
                // Menghitung total tagihan
                double totalTagihan = pemakaianKwh * tarifPerKwh;

                // Tampilan hasil akhir yang rapi
                System.out.println("\n=====================================");
                System.out.println("          RINGKASAN TAGIHAN          ");
                System.out.println("=====================================");
                System.out.printf("Golongan Daya    : %s\n", namaGolongan);
                System.out.printf("Jumlah Pemakaian : %.2f kWh\n", pemakaianKwh);
                System.out.printf("Tarif per kWh    : Rp %,.2f\n", tarifPerKwh);
                System.out.println("-------------------------------------");
                System.out.printf("TOTAL TAGIHAN    : Rp %,.2f\n", totalTagihan);
                System.out.println("=====================================");
            }
        }

        // Menutup scanner
        input.close();
    }
}