public class StudentList {
    Node head;
    Node tail;
    private int listSize;

    StudentList(){
        head = null;
        tail= null;
    }

    //only getter for listSize:
    public int getListSize(){
        return listSize;
    }

    //Check if the list is empty by checking whether head points null.
    public boolean isEmpty() { return (head == null); }

    //Adding student (increase the listSize):
    public void addStudent(Student student){

        //If the list empty, make the head and tail points the new Node:
        if (isEmpty()){
            head = tail = new Node(student);
            listSize++;
            return;
        }

        //If not, just add the new Node as tail.next (O(1) Time complexity!):
        tail.next = new Node(student);
        tail = tail.next;

        listSize++;
    }

    //Removing a Student by its ID (decrease the listSize):
    public boolean removeStudent(int studentId){

        //If the list empty, return false immediately:
        if (isEmpty()) { return false; }


        //If the student is at the beginning-
        if (head.student.getStudentId() == studentId){

            //Check whether it is the only student:
            if (head == tail){

                //If so, make the head and tail point null:
                head = tail = null;
                listSize--;
                return true;
            }

            //If not just slide the head:
            head = head.next;
            listSize--;
            return true;
        }

        //If not search the whole list until find it or reach the end of the list:
        Node curr = head;
        while (curr.next != null &&
                curr.next.student.getStudentId() != studentId){
            curr = curr.next;
        }

        //Make sure you find the student you searched for:
        if (curr.next != null){

            //Slide the tail if the student is at the end of the list:
            if (tail.student.getStudentId() == studentId) {
                tail = curr;
                tail.next = null;
                listSize--;
                return true;
            }

            //Bind the previous Node to the one after next:
            curr.next = curr.next.next;
            listSize--;
            return true;
        }

        //If such student does not exist in the list
        //Or if the list is empty, return false:
        return false;
    }


    public String findStudent(int studentId){

        //Start from head and travel the list till you find it or reach the end:
        Node curr = head;
        while (curr != null &&
                curr.student.getStudentId() != studentId){
            curr = curr.next;
        }

        if (curr != null){

            //Print the info of the student if it's not the end:
            return curr.student.toString();
        }
        //If such student does not exist in the list
        //Or if the list is empty, print "Student not found!":
        return "Student not found!";
    }

    //(AI used) Print student names and IDs in a clean format:
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.printf("%-20s | %-6d%n",
                    curr.student.getName(), curr.student.getStudentId());
            curr = curr.next;
        }
    }
}
