package university.students;

public class StudentRecord {
    String studentName;
    String studentID;
    String program;

    public StudentRecord(String studentName, String studentID, String program) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.program = program;
    }

    public void showInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Program: " + program);
    }
}
