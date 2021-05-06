package ECommerce.Business.Concretes;

import ECommerce.Business.Abstracts.UserService;
import ECommerce.DataAccess.Abstracts.UserDao;
import ECommerce.Entities.Concretes.User;

import java.util.List;

public class UserManager implements UserService {

    private final UserDao userDao;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

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
