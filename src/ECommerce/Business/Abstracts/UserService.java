package ECommerce.Business.Abstracts;

import ECommerce.Entities.Concretes.User;

public interface UserService {
    boolean getByEmail(String email);

    void add(User user);
    void update(User user);
    void delete(User user);
}
