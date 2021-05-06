package ECommerce.Core.Extensions.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailRegex {
    public static boolean emailControl(String email) {
        String regexPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regexPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);

        return matcher.find();
    }
}
