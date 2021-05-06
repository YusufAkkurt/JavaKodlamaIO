package ECommerce.Business.Concretes;

import ECommerce.Business.Abstracts.AuthService;
import ECommerce.Business.Abstracts.UserService;
import ECommerce.Business.Validations.Auth.RegisterValidation;
import ECommerce.Entities.Concretes.User;

import java.util.Locale;

public record AuthManager(UserService userService) implements AuthService {
    public void login(User user) {
        if (!user.checkActivationCode()){
            System.out.println("Giriş işlemi başarısız");
            System.out.println("Aktivasyon kodunu onaylamadan giriş yapamazsınız");
            return;
        }

        System.out.println("Giriş işlemi yapıldı");
    }

    public void register(User user) {
        boolean validationResult = RegisterValidation.checkValidate(user);
        if (!validationResult) return;

        boolean userExists = userService.getByEmail(user.getEmail().toLowerCase(Locale.ROOT));
        if (userExists) {
            System.out.println("Bu email adresi mevcut lütfen farklı bir adresle deneyin");
            return;
        }

        userService.add(user);
        System.out.println("Başarıyla kayıt oldunuz");
        user.setActivateCode("YUAK123");
        System.out.println("Doğrulama maili gönderildi, E-Postanızı kontrol edin");
    }
}
