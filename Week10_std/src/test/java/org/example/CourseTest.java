package org.example;

import org.junit.Test;
//Changed star import
import static org.junit.Assert.assertTrue;

public class CourseTest {
    @Test
    public void testAddStudent() {
        //Made all instances final
        final Course course = new Course("Mathematics", 30);
        final Student student = new Student("Alice Smith", "003");
        course.addStudent(student);
        //Fixed private field usage with getter
        assertTrue(course.getStudents().contains(student));
    }
}