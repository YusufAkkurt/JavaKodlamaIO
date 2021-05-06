package ECommerce.Business.Concretes;

import ECommerce.Business.Abstracts.AuthService;
import ECommerce.Business.Abstracts.UserService;
import ECommerce.Business.Validations.Auth.RegisterValidation;
import ECommerce.Core.Adapters.AuthServiceExternal;
import ECommerce.Entities.Concretes.User;

import java.util.Locale;

public class AuthManager implements AuthService {
    private final UserService userService;
    private final AuthServiceExternal authServiceExternal;

    public AuthManager(UserService userService, AuthServiceExternal authServiceExternal){
        this.userService = userService;
        this.authServiceExternal = authServiceExternal;
    }

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

    public void registerWithGoogle(User user){
        authServiceExternal.register(user);

        user.setActivateCode("YUAK123");
        System.out.println("Doğrulama maili gönderildi, E-Postanızı kontrol edin");
    }

    public void loginWithGoogle(User user){
        if (!user.checkActivationCode()){
            System.out.println("Giriş işlemi başarısız");
            System.out.println("Aktivasyon kodunu onaylamadan giriş yapamazsınız");
            return;
        }

        authServiceExternal.login(user);
    }
}
