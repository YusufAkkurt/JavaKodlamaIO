package KodlamaIO;

public class StudentManager extends UserManager {
    public void registerCourses(Student student) {
        System.out.println(student.getFirstName() + " is");
        for (String course : student.getCourses()) {
            System.out.println(course + ", registered successfully");
        }
    }
}
