package ECommerce.DataAccess.Concretes;

import ECommerce.DataAccess.Abstracts.UserDao;
import ECommerce.Entities.Concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {
    public List<User> getAll() {
        User user = new User(1, "Yusuf", "Akkurt", "yusuf@yusuf.com", "132456");
        List<User> users = new ArrayList<>();
        users.add(user);

        return users;
    }

    public void add(User user) {
        System.out.println("Hibernate ile eklendi, " + user.getFirstName());
    }

    public void update(User user) {
        System.out.println("Hibernate ile güncellendi, " + user.getFirstName());
    }

    public void delete(User user) {
        System.out.println("Hibernate ile silindi, " + user.getFirstName());
    }
}
