package com.bridgelabz;
import java.util.regex.*;

public class UserRegistration {
    public static final String FIRST_NAME_REGEX = "^[A-Z]{1}[a-z]{2,}";
    public static boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
        return pattern.matcher(firstName).matches();
    }

    public static final String LAST_NAME_REGEX = "^[A-Z]{1}[A-Za-z]{2,}$";
    public static boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(LAST_NAME_REGEX);
        return pattern.matcher(lastName).matches();
    }

    public static final String EMAIL_REGEX = "^[A-Za-z0-9]+([._+-][A-Za-z0-9]+)*@[A-Za-z0-9]+.[A-Za-z]{2,4}([.][A-Za-z]{2})*$";
    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        if (pattern.matcher(email).matches())
            return true;
        return false;
    }

    public static final String MOBILE_NO_REGEX = "^[+]{0,1}[0-9]{2,3}[: :][7-9]{1}[0-9]{9}$";
    public static boolean validateMobileNo(String mobileNo) {
        Pattern pattern = Pattern.compile(MOBILE_NO_REGEX);
        return pattern.matcher(mobileNo).matches();
    }

    public static final String PASSWORD_REGEX ="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$";
    public static boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        return pattern.matcher(password).matches();
    }
}