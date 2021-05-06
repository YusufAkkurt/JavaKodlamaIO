package KodlamaIO.kodlamaIO;

public class InstructorManager extends UserManager {
    public void createCourses(Instructor instructor){
        System.out.println(instructor.getFirstName() + " is");
        for (String course : instructor.getCourses()) {
            System.out.println(course + ", created successfully");
        }
    }
}