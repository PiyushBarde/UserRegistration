package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name = ");
        String name = sc.next();
        UserRegistrationDetails userRegistrationDetails = new UserRegistrationDetails();
        userRegistrationDetails.setFirstName(name);
        UserRegistrationMethod userRegistrationMethod = new UserRegistrationMethod();
        userRegistrationMethod.userRegistration(userRegistrationDetails);
    }
}
