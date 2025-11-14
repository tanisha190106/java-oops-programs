package university.faculty;

public class FacultyRecord {
    String facultyName;
    String facultyID;
    String department;

    public FacultyRecord(String facultyName, String facultyID, String department) {
        this.facultyName = facultyName;
        this.facultyID = facultyID;
        this.department = department;
    }

    public void showInfo() {
        System.out.println("Faculty Name: " + facultyName);
        System.out.println("Faculty ID: " + facultyID);
        System.out.println("Department: " + department);
    }
}
