package org.example.user_registration;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean isFirstNameValid(String fname) {
        Predicate<String> notValidName = name -> !Pattern.compile("[A-Z]{1}[a-z]{2,}")
                .matcher(name)
                .matches();
        return !notValidName.test(fname);
    }

    public boolean isLastNameValid(String lname) {
        return isFirstNameValid(lname);
    }

    public boolean isEmailValid(String email) {
        Predicate<String> notValidEmail = emailStr -> !Pattern.compile("^[a-zA-Z]+@[a-zA-Z]+\\.[a-zA-Z]{2,}$")
                .matcher(emailStr)
                .matches();
        return !notValidEmail.test(email);
    }

    public boolean isPasswordValid(String password) {
        Predicate<String> notValidPassword = passwordStr -> !Pattern.compile("^(?=[^A-Z]*[A-Z])(?=[^a-z]*[a-z])(?=[^!@#$%^&*()]*[!@#$%^&*()][^!@#$%^&*()]*$).{8,}$")
                .matcher(password)
                .matches();
        return !notValidPassword.test(password);
    }

    public boolean isMobileValid(String mobile) {
        Predicate<String> notValidMobileNumber = mobileStr -> !Pattern.compile("\\d{2,3}\\s\\d{10}")
                .matcher(mobileStr)
                .matches();
        return !notValidMobileNumber.test(mobile);
    }
}
