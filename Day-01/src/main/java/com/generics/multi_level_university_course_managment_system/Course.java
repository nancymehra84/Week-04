package com.generics.multi_level_university_course_managment_system;

import java.util.List;

public class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public void evaluateCourse() {
        courseType.evaluate();
    }

    public String getCourseName() {
        return courseType.getCourseName();
    }

    public T getCourseType() {
        return courseType;
    }
}