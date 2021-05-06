package ECommerce.Business.Validations.Auth;

import ECommerce.Core.Extensions.Regex.MailRegex;
import ECommerce.Entities.Concretes.User;

import java.util.Locale;

public class LoginValidation {
    private static boolean resultOfRule = true;

    public static boolean checkValidate(User user) {
        required("Email", user.getEmail());
        required("Password", user.getPassword());

        return resultOfRule;
    }

    private static void required(String key, String value) {
        if (value == null || value.length() == 0) {
            System.out.println(key + " Alanı zorunludur.");
            resultOfRule = false;
        }
    }
}