public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Credit Card payment
        context.setPaymentStrategy(new CreditCardPayment("1234567812345678"));
        context.pay(2500.00);

        // PayPal payment
        context.setPaymentStrategy(new PayPalPayment("keerthana@email.com"));
        context.pay(1500.00);
    }
}
