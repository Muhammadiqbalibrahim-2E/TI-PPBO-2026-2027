public class RekeningBank {
    private String nomorRekening;
    private String pemilik;
    private double saldo;
    private String jenisRekening;

    // Constructor
    public RekeningBank(String nomorRekening, String pemilik,
                        String jenisRekening, double saldo) {
        this.nomorRekening = nomorRekening;
        this.pemilik = pemilik;
        this.jenisRekening = jenisRekening;

        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
            System.out.println("Saldo awal tidak boleh negatif!");
        }
    }

    // Getter
    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getPemilik() {
        return pemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getJenisRekening() {
        return jenisRekening;
    }

    // Method setor
    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setor berhasil: Rp" + jumlah);
        } else {
            System.out.println("Setor gagal! Jumlah harus lebih dari 0.");
        }
    }

    // Method tarik
    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Penarikan gagal! Jumlah harus lebih dari 0.");
        } else if (jumlah > saldo) {
            System.out.println("Penarikan gagal! Saldo tidak mencukupi.");
        } else {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil: Rp" + jumlah);
        }
    }

    // Method transfer
    public void transferKe(RekeningBank tujuan, double jumlah) {
        if (tujuan == null) {
            System.out.println("Transfer gagal! Rekening tujuan tidak valid.");
        } else if (jumlah <= 0) {
            System.out.println("Transfer gagal! Jumlah harus lebih dari 0.");
        } else if (jumlah > saldo) {
            System.out.println("Transfer gagal! Saldo tidak mencukupi.");
        } else {
            saldo -= jumlah;
            tujuan.saldo += jumlah;

            System.out.println("Transfer berhasil!");
            System.out.println("Dari   : " + pemilik);
            System.out.println("Kepada : " + tujuan.pemilik);
            System.out.println("Jumlah : Rp" + jumlah);
        }
    }

    // Method cetak mutasi
    public void cetakMutasi() {
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Pemilik        : " + pemilik);
        System.out.println("Jenis Rekening : " + jenisRekening);
        System.out.println("Saldo          : Rp" + saldo);
    }
}