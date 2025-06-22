public class Main {
    public static void main(String[] args) {

        Student student = new Student("Keerthana", "S101", "A");


        StudentView view = new StudentView();


        StudentController controller = new StudentController(student, view);


        controller.updateView();


        System.out.println("\n🔧 Updating student details...\n");
        controller.setStudentName("Siva Keerthana");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}
