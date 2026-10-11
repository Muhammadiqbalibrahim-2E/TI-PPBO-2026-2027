import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Membuat array berukuran 10
        int[] angka = new int[10];

        // Mengisi array dari input pengguna
        System.out.println("Masukkan 10 bilangan:");

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }

        // Menampilkan array dalam urutan terbalik
        System.out.println("\nArray dalam urutan terbalik:");

        for (int i = angka.length - 1; i >= 0; i--) {
            System.out.print(angka[i] + " ");
        }

        System.out.println();

        sc.close();
    }
}
