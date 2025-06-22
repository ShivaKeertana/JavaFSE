public class Main {
    public static void main(String[] args) {
        // Base notifier - Email only
        Notifier basicNotifier = new EmailNotifier();

        // Decorate with SMS
        Notifier smsNotifier = new SMSNotifierDecorator(basicNotifier);

        // Decorate with Slack too
        Notifier fullNotifier = new SlackNotifierDecorator(smsNotifier);

        System.out.println("Sending multi-channel notification:");
        fullNotifier.send("Server down alert!");
    }
}
