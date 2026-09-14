import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur Anda: ");
        int umur = sc.nextInt();

        System.out.print("Apakah Anda mahasiswa? (true/false): ");
        boolean isMahasiswa = sc.nextBoolean();

        int hargaNormal = 50000;
        int hargaDiskon = 35000;

        // Gabungan if-else dan operator logika DAN (&&)
        if (isMahasiswa && umur < 25) {
            System.out.println("Selamat! Anda mendapat harga khusus mahasiswa: Rp " + hargaDiskon);
        } else {
            System.out.println("Harga tiket Anda adalah harga normal: Rp " + hargaNormal);
        }

        sc.close();
    }
}
