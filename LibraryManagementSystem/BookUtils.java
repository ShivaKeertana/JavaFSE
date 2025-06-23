import java.util.Arrays;
import java.util.Comparator;

public class BookUtils {
    public static void sortBooksByTitle(Book[] books) {
        Arrays.sort(books, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
    }
}
