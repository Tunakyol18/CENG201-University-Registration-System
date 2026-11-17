public class Student {
    private final int studentId;
    private final String name;
    private String department;
    private double gpa;
    private int completedCredits;

    //All Constructors:

    // Name + studentId
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Name + department + studentId
    public Student(int studentId, String name, String department) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
    }

    // All Information:
    public Student(int studentId, String name, String department,
                   double gpa, int completedCredits) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.gpa = gpa;
        this.completedCredits = completedCredits;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getGpa() {
        return gpa;
    }

    public int getCompletedCredits() {
        return completedCredits;
    }

    // Setters (There is no Name and studentId Setters)
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setCompletedCredits(int completedCredits) {
        this.completedCredits = completedCredits;
    }

    //override the toString method to print the information looks readable:
    //I used AI to make it look better with formats!
    @Override
    public String toString() {
        return String.format("ID: %-6d | Name: %-18s | Dept: %-22s | GPA: %-5.2f | Credits: %d",
                studentId, name, department, gpa, completedCredits);
    }
}
