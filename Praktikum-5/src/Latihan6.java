import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();

        int[] angka = new int[n];

        // Mengisi array
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }

        // Menampilkan array sebelum sorting
        System.out.println("\nArray sebelum diurutkan:");

        for (int nilai : angka) {
            System.out.print(nilai + " ");
        }

        // Bubble sort ascending
        for (int i = 0; i < angka.length - 1; i++) {
            for (int j = 0; j < angka.length - 1 - i; j++) {

                if (angka[j] > angka[j + 1]) {
                    int temp = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = temp;
                }
            }
        }

        // Menampilkan array sesudah sorting
        System.out.println("\n\nArray sesudah diurutkan:");

        for (int nilai : angka) {
            System.out.print(nilai + " ");
        }

        System.out.println();

        sc.close();
    }
}
