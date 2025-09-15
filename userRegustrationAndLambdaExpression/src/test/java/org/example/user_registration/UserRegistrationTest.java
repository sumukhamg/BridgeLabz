package org.example.user_registration;

import org.example.user_registration.UserRegistration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    void testValidFirstName() {
        assertTrue(userRegistration.isFirstNameValid("John"));
        assertFalse(userRegistration.isFirstNameValid("jo"));
    }

    @Test
    void testValidLastName() {
        assertTrue(userRegistration.isLastNameValid("Doe"));
        assertFalse(userRegistration.isLastNameValid("do"));
    }

    @Test
    void testValidEmail() {
        assertTrue(userRegistration.isEmailValid("john@example.com"));
        assertFalse(userRegistration.isEmailValid("john.example.com"));
    }

    @Test
    void testValidPassword() {
        assertTrue(userRegistration.isPasswordValid("Aabc!123"));
        assertFalse(userRegistration.isPasswordValid("abc123"));
    }

    @Test
    void testValidMobile() {
        assertTrue(userRegistration.isMobileValid("91 9876543210"));
        assertFalse(userRegistration.isMobileValid("9876543210"));
    }
}
