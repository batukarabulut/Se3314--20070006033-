package org.example;

public class Student {
    //Fixed instances starting with upper case
    public String studentName;
    public String studentID;

    public Student(String name, String id) {
        studentName = name;
        studentID = id;
    }

    /**
     * _effect_: Getter for name.
     * @return
     */
    public String getName() {
        return studentName;
    }
}