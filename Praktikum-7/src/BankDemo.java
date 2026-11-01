public class BankDemo {
    public static void main(String[] args) {

        // Membuat dua objek rekening
        RekeningBank rekening1 = new RekeningBank(
                "100001",
                "Iqbal",
                "Tabungan",
                1000000
        );

        RekeningBank rekening2 = new RekeningBank(
                "100002",
                "Andi",
                "Giro",
                500000
        );

        // Menampilkan saldo awal
        System.out.println("===== SALDO AWAL =====");

        rekening1.cetakMutasi();

        System.out.println();

        rekening2.cetakMutasi();

        // Transaksi rekening 1
        System.out.println("\n===== TRANSAKSI REKENING 1 =====");

        rekening1.setor(200000);
        rekening1.tarik(100000);

        // Transaksi rekening 2
        System.out.println("\n===== TRANSAKSI REKENING 2 =====");

        rekening2.setor(100000);
        rekening2.tarik(50000);

        // Transfer berhasil
        System.out.println("\n===== TRANSFER BERHASIL =====");

        rekening1.transferKe(rekening2, 300000);

        // Transfer gagal
        System.out.println("\n===== TRANSFER GAGAL =====");

        rekening2.transferKe(rekening1, 1000000);

        // Menampilkan saldo akhir
        System.out.println("\n===== MUTASI AKHIR REKENING 1 =====");

        rekening1.cetakMutasi();

        System.out.println("\n===== MUTASI AKHIR REKENING 2 =====");

        rekening2.cetakMutasi();
    }
}