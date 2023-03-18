package org.example;

import org.example.gradeCalc.Course;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class CouseTest {

    @DisplayName("과목(코스)를 생성한다.")
    @Test
    void cratedTest() {
        assertThatCode(() -> new Course("OOP", 3, "A+"))
                .doesNotThrowAnyException();
    }

}
