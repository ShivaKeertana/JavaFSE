public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product("P001", "Mouse", 100, 299.99);
        Product p2 = new Product("P002", "Keyboard", 50, 499.00);

        manager.addProduct(p1);
        manager.addProduct(p2);

        manager.listAllProducts();

        manager.updateProduct("P001", "Wireless Mouse", 80, 349.99);
        manager.viewProduct("P001");

        manager.deleteProduct("P002");
        manager.viewProduct("P002");
    }
}
