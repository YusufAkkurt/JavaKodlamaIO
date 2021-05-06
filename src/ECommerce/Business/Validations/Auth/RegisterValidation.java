package ECommerce.Business.Validations.Auth;

import ECommerce.Core.Extensions.Regex.MailRegex;
import ECommerce.Entities.Concretes.User;

import java.util.Locale;

public class RegisterValidation implements Validation {
    public static boolean checkValidate(User user){
        boolean result = checkEmailFormat(user.getEmail());
        if (result) {
            result = checkPasswordLength(user.getPassword());
        }

        return result;
    }

    private static boolean checkEmailFormat(String email){
        boolean result = MailRegex.emailControl(email.toLowerCase(Locale.ROOT));

        if (!result)
            System.out.println("Geçersiz format! Email adresinizi kontrol edin");

        return result;
    }

    private static boolean checkPasswordLength(String password){
        boolean result = true;

        if (password.length() < 6){
            System.out.println("Şifreniz en az 6 karakter olmalıdır");
            result = false;
        }

        return result;
    }
}