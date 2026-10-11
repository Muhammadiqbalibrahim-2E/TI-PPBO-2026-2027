import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriks = new int[3][3];

        // Mengisi matriks 3 x 3
        System.out.println("Masukkan elemen matriks 3x3:");

        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 3; kolom++) {
                System.out.print("Matriks[" + baris + "][" + kolom + "] = ");
                matriks[baris][kolom] = sc.nextInt();
            }
        }

        // Menampilkan jumlah setiap baris
        System.out.println("\nJumlah setiap baris:");

        int totalSemua = 0;

        for (int baris = 0; baris < 3; baris++) {
            int totalBaris = 0;

            for (int kolom = 0; kolom < 3; kolom++) {
                totalBaris += matriks[baris][kolom];
            }

            System.out.println("Baris " + (baris + 1) + ": " + totalBaris);
            totalSemua += totalBaris;
        }

        // Menampilkan jumlah seluruh elemen
        System.out.println("Jumlah seluruh elemen: " + totalSemua);

        sc.close();
    }
}
