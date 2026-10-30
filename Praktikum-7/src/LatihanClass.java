public class LatihanClass {

    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa("Budi", "111", 3.5);

        m1.setIpk(3.8);

        System.out.println("IPK sekarang: " + m1.getIpk());

        m1.setIpk(9.9);

        System.out.println("IPK sekarang: " + m1.getIpk());

    }
}