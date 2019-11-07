package com.company;

public class Crow extends Bird {
    private float weight;

    public Crow(String colorOfTheBird, String formOfTheBeak, int age, float weight) {
        super(colorOfTheBird, formOfTheBeak, age);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
        public void sound() {
        System.out.println("Crow croak");
    }

    @Override
    public String toString() {
        return  " Weight = " + weight +
                "\nColor of the bird = " + colorOfTheBird +
                "\nForm of the beak = " + formOfTheBeak +
                "\nAge = " + age + "\n";
    }
}