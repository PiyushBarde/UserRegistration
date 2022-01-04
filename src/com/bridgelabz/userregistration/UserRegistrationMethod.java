package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMethod {
    private static final String NAME_REGEX= "^[A-Z][a-z A-Z]{2,}";
    public void userRegistration(UserRegistrationDetails userRegistrationDetails){
        Pattern pattern = Pattern.compile(NAME_REGEX);
        System.out.println(userRegistrationDetails.getFirstName());
        Matcher matcher = pattern.matcher(userRegistrationDetails.getFirstName());
        Boolean invalid = matcher.matches();
        System.out.println(invalid);
    }

}
