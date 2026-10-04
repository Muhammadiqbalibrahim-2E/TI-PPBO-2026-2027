import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan ukuran: ");
        int ukuran = sc.nextInt();

        // Pola segitiga terbalik
        System.out.println("\nSegitiga Terbalik:");

        for (int i = ukuran; i >= 1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        // Pola persegi
        System.out.println("\nPola Persegi:");

        for (int i = 1; i <= ukuran; i++) {
            for (int j = 1; j <= ukuran; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
