public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Mouse", "Electronics"),
            new Product("P002", "Shirt", "Clothing"),
            new Product("P003", "Laptop", "Electronics"),
            new Product("P004", "Table", "Furniture"),
            new Product("P005", "Book", "Stationery")
        };

        // Linear Search
        Product result1 = SearchAlgorithms.linearSearch(products, "Laptop");
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

        // Sort and do Binary Search
        ProductUtils.sortByName(products);
        Product result2 = SearchAlgorithms.binarySearch(products, "Laptop");
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}
