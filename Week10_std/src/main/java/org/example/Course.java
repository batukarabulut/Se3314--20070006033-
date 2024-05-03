package org.example;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private static int total_Courses = 0;

    //Fixed instances starting with upper case
    private String courseName;
    private final int capacity;
    private List<Student> students = new ArrayList<>();

    public Course(String name, int capacity) {
        courseName = name;
        this.capacity = capacity;
        total_Courses++;
    }

    /**
     * Add new student to course.
     * @param student
     */
    public void addStudent(Student student) {
        if (students.size() < capacity)
            students.add(student);
    }

    /**
     * _effect_: Getter for course name.
     * @return
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * _effect_: Getter for total courses.
     * @return
     */
    public static int getTotalCourses() { return total_Courses; }

    /**
     * _effects_: Getter for student list.
     * @return
     */
    //Added getter to fix the invalid usage in University class.
    public List<Student> getStudents() {
        return students;
    }
}