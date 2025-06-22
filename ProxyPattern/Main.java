public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("nature.jpg");

        System.out.println("First call:");
        image1.display(); // Loads and displays

        System.out.println("\nSecond call:");
        image1.display(); // Uses cached image

        // Try another image
        Image image2 = new ProxyImage("space.jpg");

        System.out.println("\nAnother image:");
        image2.display(); // Loads and displays
    }
}
