package com.bridgelabz;

import java.util.regex.Pattern;

public class UserEmail {
	public static final String EMAIL_REGEX = "^[A-Za-z0-9]+([._+-][A-Za-z0-9]+)*@[A-Za-z0-9]+.[A-Za-z]{2,4}([.][A-Za-z]{2})*$";
    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        if (pattern.matcher(email).matches())
            return true;
        return false;
    }
}