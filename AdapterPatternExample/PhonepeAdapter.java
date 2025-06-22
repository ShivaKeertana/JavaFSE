public class PhonepeAdapter implements PaymentProcessor {
    private Phonepe phonepe;

    public PhonepeAdapter(Phonepe phonepe) {
        this.phonepe = phonepe;
    }

    public void processPayment(double amount) {
        phonepe.sendPayment(amount);
    }
}