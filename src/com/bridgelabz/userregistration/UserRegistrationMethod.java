package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistrationMethod {
    private static final String FIRST_NAME_REGEX= "^[A-Z][a-z A-Z]{2,}";
    private static final String EMAIL_REGEX= "^[abc]+[0-9.+!#$%&()_]{0,}+@[a-z0-9.]+[com]$";
    private static final String PASSWORD_REGEX= "(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$";


    //    public void oneForAll(UserRegistrationDetails userRegistrationDetails){
//        boolean isNumberValid = verificationForAll(NUMBER_REGEX,userRegistrationDetails.getNumber());
//        System.out.println(isNumberValid);
//    }
//    public boolean verificationForAll(String regex,String dataToBeValidated){
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(dataToBeValidated);
//        boolean invalid = matcher.matches();
//        return invalid;
//
//    }


    public boolean passwordVerification(String dataToBeVerified)
    {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        Matcher matcher = pattern.matcher(dataToBeVerified);
        boolean invalid = matcher.matches();
        System.out.println(invalid);
        return invalid;
    }
    public boolean verificationForNumber(UserRegistrationDetails userRegistrationDetails)
    {
            Pattern pattern = Pattern.compile("^[0-9]{1,}[\\s0-9]{0,10}");
            Matcher matcher = pattern.matcher(userRegistrationDetails.getNumber());
            boolean invalid = matcher.matches();
            System.out.println(invalid);
            if(invalid==false)
            {
                System.err.println("invalid Password(Enter at least 8 char");
                return false;
            }
            else {
                return true;
            }
    }




    public boolean verificationNames(String dataToBeValidated){
        Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
        Matcher matcher = pattern.matcher(dataToBeValidated);
        boolean invalid = matcher.matches();
        if(invalid==false)
        {
            System.err.println("Invalid Name");
            return false;
        }
        else {
            return true;
        }
    }

    public boolean verificationEmail(String dataToBeVerified){
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(dataToBeVerified);
        boolean invalid = matcher.matches();
        if(invalid==false)
        {
            System.err.println("Invalid Email");
            return false;
        }
        else {
            return true;
        }
    }

    public void finalArgument(boolean firstName,boolean lastName, boolean email,UserRegistrationDetails userRegistrationDetails){
        if(firstName==lastName==email==true) {
            System.out.println("Details are correct...Welcome!! " + userRegistrationDetails.getFirstName() + " " + userRegistrationDetails.getLastName());
        }
    }

}
