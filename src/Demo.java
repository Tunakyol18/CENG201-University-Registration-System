//AI used for this test. To skip the initialize part and the print parts.

public class Demo {
    public static void main(String[] args) {
        System.out.println("=== TASK 1: STUDENT LIST TEST ===");

        //Create the list:
        StudentList studentList = new StudentList();


        //Initialize 5 students:
        Student student1 = new Student(101, "Ahmet Yilmaz", "Software Engineering", 3.45, 65);
        Student student2 = new Student(102, "Zeynep Kaya", "Computer Engineering", 3.80, 72);
        Student student3 = new Student(103, "Mehmet Demir", "Aerospace Engineering", 2.95, 60);
        Student student4 = new Student(104, "Elif Sahin", "Industrial Engineering", 3.60, 68);
        Student student5 = new Student(105, "Can Ozturk", "Electrical Engineering", 3.10, 62);

        //Add them in the list:
        studentList.addStudent(student1);
        studentList.addStudent(student2);
        studentList.addStudent(student3);
        studentList.addStudent(student4);
        studentList.addStudent(student5);

        //Print the Initial List:
        System.out.println("Initial Student List:");
        studentList.printList();

        //Remove one student by ID:
        System.out.println("\nRemoving student with ID 103...");
        boolean isRemoved = studentList.removeStudent(103);
        System.out.println("Removed successfully: " + isRemoved);

        //Search for one student by ID:
        System.out.println("\nSearching for student with ID 102...");
        System.out.println("Search Result: " + studentList.findStudent(102));

        //Print the final list:
        System.out.println("\nFinal Student List:");
        studentList.printList();
    }
}