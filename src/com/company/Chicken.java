package com.company;

public class Chicken extends Bird {
    public Chicken(String colorOfTheBird, String formOfTheBeak, int age) {
        super(colorOfTheBird, formOfTheBeak, age);
    }

    @Override
    public void sound() {
        System.out.println("Chicken chirp");
    }

    @Override
    public String toString() {
        return
                "Color of the bird = " + colorOfTheBird +
                "\nForm of the beak = " + formOfTheBeak +
                "\nAge = " + age + "\n" ;
    }
}