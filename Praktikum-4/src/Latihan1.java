import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int bilangan = sc.nextInt();

        System.out.println("\nTabel Perkalian " + bilangan);

        // Mencetak perkalian 1 sampai 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(bilangan + " x " + i + " = " + (bilangan * i));
        }

        sc.close();
    }
}
