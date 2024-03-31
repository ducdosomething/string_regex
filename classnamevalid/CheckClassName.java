package classnamevalid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckClassName {
    public boolean checkClassName(String className) {
        // Check class name
        if (className.length() != 7) {
            return false;
        }

        // Check the first char
        if (!(className.charAt(0) == 'C' || className.charAt(0) == 'A' || className.charAt(0) == 'P')) {
            return false;
        }

        // Check the next 4 char is numbers
        try {
            Integer.parseInt(className.substring(1, 5));
        } catch (NumberFormatException e) {
            return false;
        }

        // Check the last char
        if (!(className.charAt(6) == 'G' || className.charAt(6) == 'H' || className.charAt(6) == 'I'
                || className.charAt(6) == 'K')) {
            return false;
        }

        // Check there are no special character
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(className);
        if (matcher.find()) {
            return false;
        }

        return true;
    }
}
