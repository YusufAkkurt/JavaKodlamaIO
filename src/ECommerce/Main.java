package ECommerce;

import ECommerce.Business.Concretes.UserManager;
import ECommerce.DataAccess.Concretes.HibernateUserDao;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager(new HibernateUserDao());
        boolean userExists = userManager.getByEmail("yusuf@yusuf.com");

        System.out.println(userExists);
    }
}
