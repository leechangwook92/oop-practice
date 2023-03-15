package org.example;

import org.example.passwordTest.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    @DisplayName("패스워드 초기화")
    @Test
    void passwordTest() {

        // given
        User user = new User();

        // when
        user.initPassword(() -> "ssbbfccgh");

        // then
        assertThat(user.getPassword()).isNotNull();

    }

    @DisplayName("패스워드가 요구사항에 부합해 초기화 되지 않는다.")
    @Test
    void passwordTest2() {

        // given
        User user = new User();

        // when
        user.initPassword(() -> "aabb");

        // then
        assertThat(user.getPassword()).isNull();

    }

}