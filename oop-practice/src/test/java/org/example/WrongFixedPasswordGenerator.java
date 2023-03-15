package org.example;

import org.example.passwordTest.PasswordGenerator;

public class WrongFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "dd";
    }
}
