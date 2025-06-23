public class TaskManager {
    private Node head;

    // Add task at end
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null)
                current = current.next;
            current.next = newNode;
        }
        System.out.println("Task added: " + task.taskId);
    }

    // Search task by ID
    public Task searchTask(int id) {
        Node current = head;
        while (current != null) {
            if (current.task.taskId == id)
                return current.task;
            current = current.next;
        }
        return null;
    }

    // Delete task by ID
    public void deleteTask(int id) {
        if (head == null) return;

        if (head.task.taskId == id) {
            head = head.next;
            System.out.println("Task deleted: " + id);
            return;
        }

        Node current = head;
        while (current.next != null && current.next.task.taskId != id)
            current = current.next;

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Task deleted: " + id);
        } else {
            System.out.println("Task not found: " + id);
        }
    }

    // Traverse all tasks
    public void listTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }
}
