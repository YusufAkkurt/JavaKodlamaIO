package ECommerce.Business.Concretes;

import ECommerce.Business.Abstracts.AuthService;
import ECommerce.Business.Abstracts.UserService;
import ECommerce.Core.Extensions.Regex.MailRegex;
import ECommerce.Entities.Concretes.User;

import java.util.Locale;

public record AuthManager(UserService userService) implements AuthService {
    public void login(User user) {
        System.out.println("Giriş işlemi yapıldı");
    }

    public void register(User user) {
        boolean checkMail = MailRegex.emailControl(user.getEmail());
        boolean userExists = userService.getByEmail(user.getEmail().toLowerCase(Locale.ROOT));

        if (!checkMail){
            System.out.println("Geçersiz format! Email adresinizi kontrol edin");
            return;
        }

        if (userExists){
            System.out.println("Bu email adresi mevcut lütfen farklı bir adresle deneyin");
            return;
        }

        userService.add(user);
        System.out.println("Başarıyla kayıt oldunuz");
    }
}
