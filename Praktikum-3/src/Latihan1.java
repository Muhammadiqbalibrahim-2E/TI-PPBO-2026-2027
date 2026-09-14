import java.util.Scanner;
public class Latihan1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan sebuah bilangan bulat: ");
    int bilangan = sc.nextInt();

    // Memeriksa sisa bagi dengan operator %
    if (bilangan % 2 == 0) {
        System.out.println(bilangan + " adalah bilangan GENAP.");
    } else {
        System.out.println(bilangan + " adalah bilangan GANJIL.");
    }

    sc.close();
}
}

