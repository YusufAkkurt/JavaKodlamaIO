public class UserManager {
    public void add(User user) {
        System.out.println(user.getFirstName() + ", added successfully");
    }

    public void delete(User user) {
        System.out.println(user.getFirstName() + ", deleted successfully");
    }
}