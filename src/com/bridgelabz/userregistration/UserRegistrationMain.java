package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name = ");
        String nameFirst = sc.next();
        System.out.println("Enter your last name = ");
        String nameLast = sc.next();
        UserRegistrationDetails userRegistrationDetails = new UserRegistrationDetails();
        userRegistrationDetails.setFirstName(nameFirst);
        userRegistrationDetails.setLastName(nameLast);
        UserRegistrationMethod userRegistrationMethod = new UserRegistrationMethod();
        userRegistrationMethod.userRegistration(userRegistrationDetails.getFirstName());
        userRegistrationMethod.userRegistration(userRegistrationDetails.getLastName());
    }
}
