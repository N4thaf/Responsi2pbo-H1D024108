public class PaymentTest {
    public static void main(String[] args) {
        EWalletPayment payment = new EWalletPayment("OVO", 150000, 50000);

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");
        System.out.println("Saldo awal: " + (int)payment.getBalance());
        System.out.println("Memproses pembayaran sebesar 50000...");
        System.out.println();

        payment.processPayment();
        System.out.println(payment.getPaymentDetails());
    }
}
