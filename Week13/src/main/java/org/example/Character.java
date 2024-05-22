package org.example;

public class Character {
    // Encapsulation: Fields are made private to prevent direct access.
    private String name;
    private int age;

    public Character(String name, int age) {
        // Bug Fix: Use 'this' to refer to the instance variables, not the local variables.
        this.name = name;
        this.age = age;
    }

    // Getter for name: Allows read access to the private 'name' field.
    public String getName() {
        return name;
    }

    // Setter for name: Allows write access to the private 'name' field.
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age: Allows read access to the private 'age' field.
    public int getAge() {
        return age;
    }

    // Setter for age: Allows write access to the private 'age' field.
    public void setAge(int age) {
        this.age = age;
    }
}