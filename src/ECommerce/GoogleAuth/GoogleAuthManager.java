package ECommerce.GoogleAuth;

import ECommerce.Entities.Concretes.User;

public class GoogleAuthManager implements GoogleAuthService {
    public boolean register(User user) {
        System.out.println("Google hesabı ile kayıt olundu, " + user.getFirstName());
        return true;
    }

    public boolean login(User user) {
        System.out.println("Google hesabı ile giriş yapıldı, " + user.getFirstName());
        return true;
    }
}
