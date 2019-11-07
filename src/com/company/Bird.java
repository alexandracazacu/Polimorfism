package com.company;

public abstract class Bird {
    protected String colorOfTheBird;
    protected String formOfTheBeak;
    protected int age;

    public Bird(String colorOfTheBird, String formOfTheBeak, int age) {
        this.colorOfTheBird = colorOfTheBird;
        this.formOfTheBeak = formOfTheBeak;
        this.age = age;
    }

    public String getColorOfTheBird() {
        return colorOfTheBird;
    }

    public void setColorOfTheBird(String classOfTheBird) {
        this.colorOfTheBird = classOfTheBird;
    }

    public String getformOfTheBeak() {
        return formOfTheBeak;
    }

    public void setformOfTheBeak(String formOfTheBeak) {
        this.formOfTheBeak = formOfTheBeak;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    abstract public void sound();

}