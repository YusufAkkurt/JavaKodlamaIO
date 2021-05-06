package ECommerce;

import ECommerce.Business.Concretes.AuthManager;
import ECommerce.Business.Concretes.UserManager;
import ECommerce.DataAccess.Concretes.HibernateUserDao;
import ECommerce.Entities.Concretes.User;

public class Main {
    public static void main(String[] args) {
        User user = new User(1,"Yusuf", "Akkurt", "yusuf@yusuf.com", "123456");
        AuthManager authManager = new AuthManager(new UserManager(new HibernateUserDao()));

        System.out.println("----------------------------");
        authManager.register(user);
        System.out.println("----------------------------");
        user.setConfirmActivationCode("YUAK123");
        authManager.login(user);
    }
}
