package org.example.calc;

import org.example.passwordTest.PasswordGenerator;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "sssbbbdd";
    }
}
