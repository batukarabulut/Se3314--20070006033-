package org.example;

import org.junit.Test;
//Fixed star import
import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void testGetName() {
        //Made all instances final
        final Student student = new Student("Bob Johnson", "004");
        assertEquals("Bob Johnson", student.getName());
    }
}