package org.example;

import org.junit.Test;
//Fixed star imports
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UniversityTest {
    @Test
    public void testAddCourse() {
        //Made all instances final
        final University university = new University();
        final Course course = new Course("Computer Science", 100);
        university.addCourse(course);
        //Changed private field usage with getter
        assertEquals(1, university.getCourses().size());
    }

    @Test
    public void testRegisterStudentForCourse() {
        //Made all instances final
        final University university = new University();
        final Student student = new Student("John Doe", "002");
        final Course course = new Course("Computer Science", 100);
        university.addCourse(course);
        university.registerStudentForCourse(student, course);
        //Changed private field usage with getter
        assertTrue(course.getStudents().contains(student));
    }
}
