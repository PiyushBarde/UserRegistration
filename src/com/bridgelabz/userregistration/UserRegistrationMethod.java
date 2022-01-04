package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMethod {
    private static final String FIRST_NAME_REGEX= "^[A-Z][a-z A-Z]{2,}";
    private static final String LAST_NAME_REGEX= "^[A-Z][a-z A-Z]{2,}";
    int counter = 0;
    String temp;
    public void userRegistration(String dataToBeValidated){
        Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
        Matcher matcher = pattern.matcher(dataToBeValidated);
        Boolean invalid = matcher.matches();
        if(invalid==true && counter==0){
            temp=dataToBeValidated;
        }
        else if(invalid==true) {
            System.out.print("Details are valid...Welcome !! " + temp + " "+ dataToBeValidated);
        }
        else {
            System.err.println("Enter valid Details");
        }
        counter++;
    }

}
