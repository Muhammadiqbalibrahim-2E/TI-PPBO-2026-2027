import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan berat badan (kg): ");
        double berat = sc.nextDouble();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggiCm = sc.nextDouble();

        // Mengubah tinggi dari centimeter ke meter
        double tinggiMeter = tinggiCm / 100.0;

        // Menghitung nilai BMI
        double bmi = berat / (tinggiMeter * tinggiMeter);
        System.out.printf("Nilai BMI Anda: %.2f\n", bmi);

        // Klasifikasi menggunakan if-else bertingkat
        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Kategori: Normal");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Kategori: Gemuk");
        } else {
            System.out.println("Kategori: Obesitas");
        }

        sc.close();
    }
}
