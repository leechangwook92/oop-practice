package org.example.passwordTest;

//import org.example.passwordTest.RandomPasswordGenerator;

import org.example.passwordTest.PasswordGenerator;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator) {
//        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator(); // 패키지가 변경되면 import를 헤줘야해서 강한결합 방식의 테스트
        //String randomPassword = randomPasswordGenerator.generatePassword();


        // interface를 구현함으로써 두가지의 테스트 방식을 진행가능. 느슨한 결합
        String randomPassword = passwordGenerator.generatePassword();

        int rp = randomPassword.length();

        if(rp >= 8 && rp <= 12 ) {
            this.password = randomPassword;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
