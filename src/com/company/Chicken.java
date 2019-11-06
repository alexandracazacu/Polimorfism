package com.company;

public class Chicken extends Bird {
    public Chicken(String nameOfTheBird, String formOfTheBeak, int age) {
        super(nameOfTheBird, formOfTheBeak, age);
    }

    @Override
    public void sound() {
        System.out.println("Chicken chirp");
    }

    @Override
    public String toString() {
        return
                "Name of the bird = " + nameOfTheBird +
                "\nForm of the beak = " + formOfTheBeak +
                "\nAge = " + age + "\n" ;
    }
}