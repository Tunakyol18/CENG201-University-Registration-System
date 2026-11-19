public class DropRecord {
    private int studentId;
    private String courseCode;
    private long dropTime;

    //Constructor:
    DropRecord(int id, String code, long time){
        studentId = id;
        courseCode = code;
        dropTime = time;
    }

    //Getter methods:
    public int getStudentId() { return studentId; }

    public long getDropTime() { return dropTime; }

    public String getCourseCode() { return courseCode; }

    @Override
    public String toString() {
        return String.format("Student ID: %-6d | Course: %-10s | Drop Time: %d",
                studentId, courseCode, dropTime);
    }
}
