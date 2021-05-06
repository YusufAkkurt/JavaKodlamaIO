package ECommerce.DataAccess.Abstracts;

import ECommerce.Entities.Concretes.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();

    void add(User user);
    void update(User user);
    void delete(User user);
}
