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


        System.out.println("\n=== TASK 2: REGISTRATION QUEUE TEST ===");

        //Create the queue:
        RegistrationQueue registrationQueue = new RegistrationQueue();

        //Initialize 8 registration requests:
        RegistrationRequest request1 = new RegistrationRequest(101, "CENG 201", 1001L);
        RegistrationRequest request2 = new RegistrationRequest(102, "CENG 201", 1002L);
        RegistrationRequest request3 = new RegistrationRequest(103, "MATH 203", 1003L);
        RegistrationRequest request4 = new RegistrationRequest(104, "PHYS 102", 1004L);
        RegistrationRequest request5 = new RegistrationRequest(105, "CENG 205", 1005L);
        RegistrationRequest request6 = new RegistrationRequest(106, "HIST 201", 1006L);
        RegistrationRequest request7 = new RegistrationRequest(107, "CENG 201", 1007L);
        RegistrationRequest request8 = new RegistrationRequest(108, "ENG 201", 1008L);

        //Enqueue all 8 requests:
        registrationQueue.enqueue(request1);
        registrationQueue.enqueue(request2);
        registrationQueue.enqueue(request3);
        registrationQueue.enqueue(request4);
        registrationQueue.enqueue(request5);
        registrationQueue.enqueue(request6);
        registrationQueue.enqueue(request7);
        registrationQueue.enqueue(request8);

        //Print the initial queue and size:
        System.out.println("Initial Queue (Size: " + registrationQueue.size() + "):");
        registrationQueue.printQueue();

        //Process (dequeue) 3 requests:
        System.out.println("\nProcessing 3 requests (FIFO)...");
        System.out.println("Processed: " + registrationQueue.dequeue());
        System.out.println("Processed: " + registrationQueue.dequeue());
        System.out.println("Processed: " + registrationQueue.dequeue());

        //Print the remaining queue and size:
        System.out.println("\nRemaining Queue (Size: " + registrationQueue.size() + "):");
        registrationQueue.printQueue();


        System.out.println("\n=== TASK 3: COURSE DROP STACK TEST ===");

        //Create the stack:
        DropStack dropStack = new DropStack();

        //Initialize 5 course-drop records:
        DropRecord drop1 = new DropRecord(101, "CENG 201", 2001L);
        DropRecord drop2 = new DropRecord(102, "MATH 203", 2002L);
        DropRecord drop3 = new DropRecord(103, "PHYS 102", 2003L);
        DropRecord drop4 = new DropRecord(104, "CENG 205", 2004L);
        DropRecord drop5 = new DropRecord(105, "HIST 201", 2005L);

        //Push all 5 records:
        dropStack.push(drop1);
        dropStack.push(drop2);
        dropStack.push(drop3);
        dropStack.push(drop4);
        dropStack.push(drop5);

        //Print the initial stack and top element:
        System.out.println("Initial Stack (Size: " + dropStack.getSize() + "):");
        dropStack.printStack();
        System.out.println("Top Record (Peek): " + dropStack.peek());

        //Process (pop) 2 records:
        System.out.println("\nProcessing 2 drop records (LIFO)...");
        System.out.println("Processed: " + dropStack.pop());
        System.out.println("Processed: " + dropStack.pop());

        //Print the remaining stack and size:
        System.out.println("\nRemaining Stack (Size: " + dropStack.getSize() + "):");
        dropStack.printStack();
    }
}