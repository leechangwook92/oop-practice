package org.example;

import org.example.passwordTest.PasswordGenerator;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "sssbbbdd";
    }
}
