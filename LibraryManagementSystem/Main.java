public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "Java Programming", "James Gosling"),
            new Book(102, "Data Structures", "Mark Allen Weiss"),
            new Book(103, "Operating Systems", "Galvin"),
            new Book(104, "Web Development", "Keerthana")
        };

        System.out.println("Linear Search:");
        Book result1 = SearchAlgorithms.linearSearch(books, "Operating Systems");
        System.out.println(result1 != null ? result1 : "Book not found");

        // Sort before binary search
        BookUtils.sortBooksByTitle(books);

        // Binary Search
        System.out.println("\nBinary Search:");
        Book result2 = SearchAlgorithms.binarySearch(books, "Operating Systems");
        System.out.println(result2 != null ? result2 : "Book not found");
    }
}
