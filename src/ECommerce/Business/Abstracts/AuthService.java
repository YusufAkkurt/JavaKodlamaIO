package ECommerce.Business.Abstracts;

import ECommerce.Entities.Concretes.User;

public interface AuthService {
    void login(User user);
    void register(User user);
}
