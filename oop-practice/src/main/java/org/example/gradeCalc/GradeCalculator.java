package org.example.gradeCalc;

import java.util.List;

public class GradeCalculator {

    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    /**
     * 학점계산기 구현
     * • 요구사항
     * • 평균학점 계산 방법 = (학점수×교과목 평점)의 합계/수강신청 총학점 수
     * • MVC패턴(Model-View-Controller) 기반으로 구현한다.
     * • 일급 컬렉션 사용
     */
    public double calculateGrade() {

        double multipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();

//        double multipliedCreditAndCourseGrade = 0;
//
//        for (Course course : courses) {
//            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();// 응집도가 약한 코드 course.getCredit() * course.getGradeNumber();
//            // 객체에게 위임해서 코드 응집도를 높혀야함
//        }

        int totalCompleteCredit = courses.calculateTotalCompleteCredit();

//        int totalCompleteCredit = courses.stream()
//                .mapToInt(Course::getCredit)
//                .sum();

        return multipliedCreditAndCourseGrade/ totalCompleteCredit;
    }
}
