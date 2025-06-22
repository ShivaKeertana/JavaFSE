public class Main {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PhonepeAdapter(new Phonepe());
        paypalProcessor.processPayment(1500.00);

        PaymentProcessor googlepayProcessor = new GooglepayAdapter(new Googlepay());
        googlepayProcessor.processPayment(2200.00);

        PaymentProcessor paytmProcessor = new PaytmAdapter(new Paytm());
        paytmProcessor.processPayment(1000.00);
    }
}
