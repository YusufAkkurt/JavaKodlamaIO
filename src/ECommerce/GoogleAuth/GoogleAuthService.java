package ECommerce.GoogleAuth;

import ECommerce.Entities.Concretes.User;

public interface GoogleAuthService {
    boolean register(User user);
    boolean login(User user);
}
