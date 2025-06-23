import java.util.HashMap;

public class InventoryManager {
    private HashMap<String, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product added: " + product.getProductId());
    }

    public void updateProduct(String productId, String name, int qty, double price) {
        Product p = inventory.get(productId);
        if (p != null) {
            p.setProductName(name);
            p.setQuantity(qty);
            p.setPrice(price);
            System.out.println("Product updated: " + productId);
        } else {
            System.out.println("Product not found: " + productId);
        }
    }

    public void deleteProduct(String productId) {
        if (inventory.remove(productId) != null) {
            System.out.println("Product removed: " + productId);
        } else {
            System.out.println("Product not found: " + productId);
        }
    }

    public void viewProduct(String productId) {
        Product p = inventory.get(productId);
        if (p != null) {
            System.out.println(p);
        } else {
            System.out.println("Product not found: " + productId);
        }
    }

    public void listAllProducts() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            inventory.values().forEach(System.out::println);
        }
    }
}
