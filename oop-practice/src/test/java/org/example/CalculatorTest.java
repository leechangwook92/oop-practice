package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 사칙연산 계산기 구현
 * • 요구사항
 * • 간단한 사칙연산을 할 수 있다.
 * • 양수로만 계산할 수 있다.
 * • 나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다.
 * • MVC패턴(Model-View-Controller) 기반으로 구현한다.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {
    @DisplayName("덧셈 연산을 수행")
    @Test
    void additionTest() {
        int result = Calculator.calculate(2,"+",1);

        assertThat(result).isEqualTo(3);
    }

    @DisplayName("뺄셈 연산을 수행")
    @Test
    void subtractionTest() {
        int result = Calculator.calculate(2,"-",1);

        assertThat(result).isEqualTo(1);
    }

    @DisplayName("연산을 수행")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void calcTest(int operator1, String operator, int operator2, int result) {
        int calcResult = Calculator.calculate(operator1,operator,operator2);

        assertThat(calcResult).isEqualTo(result);
    }

    private static Stream<Arguments> formulaAndResult() {
        return Stream.of(
          Arguments.arguments(1, "+", "2", 3),
          Arguments.arguments(1, "-", "2", -1),
          Arguments.arguments(4, "*", "2", 8),
          Arguments.arguments(4, "/", "2", 2)
        );
    }
}
