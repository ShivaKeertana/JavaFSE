public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        Task t1 = new Task(1, "Design UI", "Pending");
        Task t2 = new Task(2, "Write Backend", "In Progress");
        Task t3 = new Task(3, "Test App", "Pending");

        manager.addTask(t1);
        manager.addTask(t2);
        manager.addTask(t3);

        System.out.println("\nAll Tasks:");
        manager.listTasks();

        System.out.println("\nSearching for Task 2:");
        Task found = manager.searchTask(2);
        System.out.println(found != null ? found : "Task not found");

        System.out.println("\nDeleting Task 1:");
        manager.deleteTask(1);

        System.out.println("\nUpdated Tasks:");
        manager.listTasks();
    }
}
