package org.example.gradeCalc;

import org.example.gradeCalc.Course;
import org.example.gradeCalc.GradeCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 학점계산기 구현
 * • 요구사항
 * • 평균학점 계산 방법 = (학점수×교과목 평점)의 합계/수강신청 총학점 수
 * • MVC패턴(Model-View-Controller) 기반으로 구현한다.
 * • 일급 컬렉션 사용
 */
public class GradeCalculatorTest {

    // 객체지향 설계 및 구현 방식
    // 1. 도메인을 구성하는 객체에는 어떤 것들이 있는지 고민하기
    // 학점계산기 도메인 -> 이수한 과목, 학점 계산기
    // 2. 객체들 간의 관계 고민하기
    // 3. 동적인 객체를 정적인 타입으로 추상화해서 도메인 모델링 하기
    // 만약에 이수한 과목이 객체지향 프로그래밍, 자료구조, 영여회화 이런식일때 이 세가지것들을 --> 과목(코스) 라는것으로 모델링
    // 이수한 과목을 전달하여 평균학점 계산 요청 --> 학점 계산기 --> 학점수*교과 평점의 합셰 --> 과목

    @DisplayName("평균 학점을 계산")
    @Test
    void calculateGradeTest() {
        List<Course> courses = List.of(new Course("OOP", 3, "A+"), new Course("자료구조", 3, "A+"));

        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double gradeResult = gradeCalculator.calculateGrade();
        assertThat(gradeResult).isEqualTo(4.5);
    }


}
