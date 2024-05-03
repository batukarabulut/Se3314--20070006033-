package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University {
    //Fixed instances starting with upper case
    private Map<String, Course> courses = new HashMap<>();

    /**
     * _effects_: Adds a new course to the university.
     * _requires_:
     * @param course The new course to add to the university.
     */
    public void addCourse(Course course) {
        if (course != null && !courses.containsKey(course.getCourseName()))
            courses.put(course.getCourseName(), course);
    }

    /**
     * _effects_: Registers new student for the course.
     * _requires_:
     * @param student to register
     * @param course to register the student
     */
    public void registerStudentForCourse(Student student, Course course) {
        if (courses.containsKey(course.getCourseName())) {
            courses.get(course.getCourseName()).addStudent(student);
        }
    }

    /**
     * _effects_: Print out all courses and their students.
     */
    public void printEnrollments() {
        for (Course course : courses.values()) {
            //Fixed private field usage with getter
            final List<Student> students = course.getStudents();
            System.out.println("Course: " + course.getCourseName());
            for (Student student : students) {
                System.out.println("Student: " + student.getName());
            }
        }
    }

    /**
     * _effects: Getter for courses
     * @return
     */
    //Added getter for courses to fix private field usage
    public Map<String, Course> getCourses() {
        return courses;
    }
}