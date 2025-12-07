public class EWalletPayment implements PaymentMethod {
    private String namaLayanan;
    private double saldo;
    private double nominalPembayaran;
    private final double BIAYA_TRANSAKSI = 2000;

    public EWalletPayment(String namaLayanan, double saldo, double nominalPembayaran) {
        this.namaLayanan = namaLayanan;
        this.saldo = saldo;
        this.nominalPembayaran = nominalPembayaran;
    }

    @Override
    public void processPayment() {
        double totalBiaya = nominalPembayaran + BIAYA_TRANSAKSI;

        if (saldo >= totalBiaya) {
            saldo -= totalBiaya;
            System.out.println("Pembayaran berhasil!");
            System.out.println("Sisa saldo: " + (int)saldo);
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Detail Transaksi: Pembayaran dilakukan melalui " + namaLayanan;
    }

    @Override
    public double getTransactionFee() {
        return BIAYA_TRANSAKSI;
    }

    @Override
    public double getBalance() {
        return saldo;
    }
}