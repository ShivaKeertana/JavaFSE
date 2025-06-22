public class GooglepayAdapter implements PaymentProcessor {
    private Googlepay googlepay;

    public GooglepayAdapter(Googlepay googlepay) {
        this.googlepay = googlepay;
    }

    public void processPayment(double amount) {
        googlepay.makeGooglepayPayment(amount);
    }
}