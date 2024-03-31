package phonenumbervalid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPhoneNumber {
    public boolean validatePhoneNumber(String phoneNumber) {
        // Kiểm tra độ dài của số điện thoại
        if (phoneNumber.length() != 14) {
            return false;
        }

        // Kiểm tra định dạng của số điện thoại
        Pattern pattern = Pattern.compile("\\(\\d{2}\\)-\\(0\\d{9}\\)");
        Matcher matcher = pattern.matcher(phoneNumber);

        return matcher.matches();
    }

    public static void main(String[] args) {
        CheckPhoneNumber validator = new CheckPhoneNumber();
        String phoneNumber = "(84)-(0123456789)";

        if (validator.validatePhoneNumber(phoneNumber)) {
            System.out.println(phoneNumber + " is availble");
        } else {
            System.out.println(phoneNumber + " is not availble");
        }
    }
}
