package org.example;

public class Character {
    private String name;
    private String race;
    private int age;

    public Character(String name, String race, int age) {
        this.name = name;
        this.race = race;
        this.age = age;
    }

    public void printDetails() {
        if (race.equals("Hobbit"))
            System.out.println("Character is a Hobbit");
         else


        if (age >= 50) {
            System.out.println("Character is 50 or older");
        } else if (name.equals("Frodo"))
            System.out.println("Character is Frodo");
    }
}