import university.students.StudentRecord;
import university.faculty.FacultyRecord;

public class TestUniversity {
    public static void main(String[] args) {

        StudentRecord s = new StudentRecord("Tanisha", "S101", "B.Tech CSE");
        FacultyRecord f = new FacultyRecord("Dr. Sharma", "F22", "Computer Science");

        System.out.println("---- Student Information ----");
        s.showInfo();

        System.out.println("\n---- Faculty Information ----");
        f.showInfo();
    }
}
