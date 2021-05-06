package KodlamaIO;

public class Instructor extends User {
    private String[] courses;

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}