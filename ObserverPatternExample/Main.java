public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileUser = new MobileApp("Keerthana's Mobile");
        Observer webUser = new WebApp("Keerthana's Web Dashboard");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        System.out.println("Updating stock price to ₹1200.50...");
        stockMarket.setStockPrice(1200.50);

        System.out.println("\nRemoving web user and updating stock again...");
        stockMarket.deregisterObserver(webUser);
        stockMarket.setStockPrice(1350.75);
    }
}
