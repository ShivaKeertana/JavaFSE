public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Keerthana", 1200.50),
            new Order("O002", "Abhay", 899.00),
            new Order("O003", "Akshay", 3050.75),
            new Order("O004", "Dungala", 450.00)
        };

        // Bubble Sort
        System.out.println("Bubble Sort:");
        SortAlgorithms.bubbleSort(orders);
        for (Order o : orders) System.out.println(o);

        // Reset and Quick Sort
        orders = new Order[] {
            new Order("O001", "Keerthana", 1200.50),
            new Order("O002", "Ravi", 899.00),
            new Order("O003", "Anu", 3050.75),
            new Order("O004", "Megha", 450.00)
        };

        System.out.println("\nQuick Sort:");
        SortAlgorithms.quickSort(orders, 0, orders.length - 1);
        for (Order o : orders) System.out.println(o);
    }
}
