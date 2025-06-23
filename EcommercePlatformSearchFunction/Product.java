public class Product {
    private String productId;
    private String productName;
    private String category;

    public Product(String id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }

    public String getProductId() { return productId; }
    public String getProductName() { return productName; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return "Product{" + "ID='" + productId + "', Name='" + productName + "', Category='" + category + "'}";
    }
}
