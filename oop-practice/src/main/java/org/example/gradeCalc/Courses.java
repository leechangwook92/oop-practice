package org.example.gradeCalc;

import java.util.List;

public class Courses {
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {

        return courses.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();

//        double multipliedCreditAndCourseGrade = 0;
//
//        for (Course course : courses) {
//            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();// 응집도가 약한 코드 course.getCredit() * course.getGradeNumber();
//            // 객체에게 위임해서 코드 응집도를 높혀야함
//        }
//
//        return multipliedCreditAndCourseGrade;
    }

    public int calculateTotalCompleteCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
