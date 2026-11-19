public class RegistrationRequest {

    //Declarations:
    private int studentId;
    private String courseCode;
    private long requestTime;

    //Constructor:
    RegistrationRequest(int id, String code, long time){
        studentId = id;
        courseCode = code;
        requestTime = time;
    }

    //Getter methods:
    public int getStudentId() { return studentId; }

    public long getRequestTime() { return requestTime; }

    public String getCourseCode() { return courseCode; }

    @Override
    public String toString() {
        return String.format("Student ID: %-6d | Course: %-10s | Time: %d",
                studentId, courseCode, requestTime);
    }

}
