import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        System.out.println("\n--- Hasil Aritmatika ---");
        System.out.println("Penjumlahan (" + a + " + " + b + ") = " + (a + b));
        System.out.println("Pengurangan (" + a + " - " + b + ") = " + (a - b));
        System.out.println("Perkalian (" + a + " * " + b + ")   = " + (a * b));
        System.out.println("Pembagian (" + a + " / " + b + ")   = " + ((double) a / b));
        System.out.println("Sisa Bagi (" + a + " % " + b + ")   = " + (a % b));

        System.out.println("\n--- Hasil Perbandingan ---");
        System.out.println(a + " > " + b + "  : " + (a > b));
        System.out.println(a + " < " + b + "  : " + (a < b));
        System.out.println(a + " == " + b + " : " + (a == b));

        input.close();
    }
}