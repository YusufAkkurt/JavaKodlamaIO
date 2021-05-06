package KodlamaIO.kodlamaIO;

public class Main {
    public static void main(String[] args) {
        String[] courses = {"C# / Angular", "Java / React"};
        Instructor instructor = new Instructor();
        Student student = new Student();
        InstructorManager instructorManager = new InstructorManager();
        StudentManager studentManager = new StudentManager();

        instructor.setId(1);
        instructor.setFirstName("Yasin");
        instructor.setLastName("Akkurt");
        instructor.setImage("avatar.jpg");
        instructor.setEmail("yasin@yasin.com");
        instructor.setPassword("123456");
        instructor.setCourses(courses);

        student.setId(1);
        student.setFirstName("Yusuf");
        student.setLastName("Akkurt");
        student.setImage("avatar.jpg");
        student.setEmail("yusuf@yusuf.com");
        student.setPassword("123456");
        student.setSchool("Halit Narin");
        student.setCourses(courses);
        student.setAddress("Tekirdağ, Türkiye");

        instructorManager.createCourses(instructor);
        System.out.println("--------------------");
        studentManager.registerCourses(student);
    }
}