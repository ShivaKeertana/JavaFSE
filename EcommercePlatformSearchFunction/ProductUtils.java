import java.util.Arrays;
import java.util.Comparator;

public class ProductUtils {
    public static void sortByName(Product[] products) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));
    }
}
