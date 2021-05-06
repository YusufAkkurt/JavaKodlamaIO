package ECommerce;

import ECommerce.Business.Concretes.AuthManager;
import ECommerce.Business.Concretes.UserManager;
import ECommerce.Core.Adapters.GoogleAuthManagerAdapter;
import ECommerce.DataAccess.Concretes.HibernateUserDao;
import ECommerce.Entities.Concretes.User;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Yusuf", "Akkurt", "yusuf@yusuf.com", "123456");
        AuthManager authManager = new AuthManager(
                new UserManager(new HibernateUserDao()),
                new GoogleAuthManagerAdapter()
        );

        System.out.println("----------------------------");
        authManager.registerWithGoogle(user);
        System.out.println("----------------------------");
        user.setConfirmActivationCode("YUAK123");
        System.out.println("----------------------------");
        authManager.loginWithGoogle(user);
    }
}
