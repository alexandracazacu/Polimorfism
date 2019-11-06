package com.company;

public class Crow extends Bird {
    private float weight;

    public Crow(String nameOfTheBird, String formOfTheBeak, int age, float weight) {
        super(nameOfTheBird, formOfTheBeak, age);
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
                "\nName of the bird = " + nameOfTheBird +
                "\nForm of the beak = " + formOfTheBeak +
                "\nAge = " + age + "\n";
    }
}