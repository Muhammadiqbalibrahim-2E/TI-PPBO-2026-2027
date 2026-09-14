import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int a =sc.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int b = sc.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int c = sc.nextInt();

        int terbesar;

        // Struktur if-else bertingkat
        if (a >= b) {
            if (a >= c) {
                terbesar = a;
            } else {
                terbesar = c;
            }
        } else {
            if (b >= c) {
                terbesar = b;
            } else {
                terbesar = c;
            }
        }

        System.out.println("Bilangan terbesar di antara ketiganya adalah: " + terbesar);
       sc.close();
    }
}
