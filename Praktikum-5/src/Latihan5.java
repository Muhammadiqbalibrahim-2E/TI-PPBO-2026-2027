import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array harus memiliki minimal 2 elemen.");
            sc.close();
            return;
        }

        int[] angka = new int[n];

        // Mengisi array
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }

        // Mencari nilai terbesar kedua tanpa sorting bawaan
        int terbesar = Integer.MIN_VALUE;
        int terbesarKedua = Integer.MIN_VALUE;

        for (int nilai : angka) {
            if (nilai > terbesar) {
                terbesarKedua = terbesar;
                terbesar = nilai;
            } else if (nilai > terbesarKedua && nilai < terbesar) {
                terbesarKedua = nilai;
            }
        }

        if (terbesarKedua == Integer.MIN_VALUE) {
            System.out.println("Tidak ada nilai terbesar kedua yang berbeda.");
        } else {
            System.out.println("Nilai terbesar: " + terbesar);
            System.out.println("Nilai terbesar kedua: " + terbesarKedua);
        }

        sc.close();
    }
}
