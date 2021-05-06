package ECommerce.Business.Concretes;

import ECommerce.Business.Abstracts.UserService;
import ECommerce.DataAccess.Abstracts.UserDao;
import ECommerce.Entities.Concretes.User;

import java.util.List;

public record UserManager(UserDao userDao) implements UserService {
    public boolean getByEmail(String email) {
        List<User> users = userDao.getAll();
        return users.stream().anyMatch(
                user -> user.getEmail().contains(email)
        );
    }

    public void add(User user) {
        userDao.add(user);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public void delete(User user) {
        userDao.delete(user);
    }
}
