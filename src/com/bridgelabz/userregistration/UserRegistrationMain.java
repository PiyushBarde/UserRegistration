package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name = ");
        String nameFirst = sc.next();
        System.out.println("Enter your last name = ");
        String nameLast = sc.next();
        System.out.println("Enter your email = ");
        String emailAddress = sc.next();
//        System.out.println("Enter your phone number = ");
//        String phoneNumber = sc.next();
        System.out.println("Create password = ");
        String passWord = sc.next();

        //------------user detail------------//
        UserRegistrationDetails userRegistrationDetails = new UserRegistrationDetails();
        userRegistrationDetails.setFirstName(nameFirst);
       userRegistrationDetails.setLastName(nameLast);
        userRegistrationDetails.setEmail(emailAddress);

        userRegistrationDetails.setPassword(passWord);
 //       userRegistrationDetails.setNumber(phoneNumber);

        //--------------methods-------------//

        UserRegistrationMethod userRegistrationMethod = new UserRegistrationMethod();
 //       userRegistrationMethod.verificationForNumber(userRegistrationDetails);
        userRegistrationMethod.passwordVerification(userRegistrationDetails.getPassword());
        userRegistrationMethod.finalArgument(userRegistrationMethod.verificationNames(userRegistrationDetails.getFirstName()),
                userRegistrationMethod.verificationNames(userRegistrationDetails.getLastName()),
                userRegistrationMethod.verificationEmail(userRegistrationDetails.getEmail()),
                userRegistrationMethod.verificationForNumber(userRegistrationDetails),
                userRegistrationDetails);
    }
}
