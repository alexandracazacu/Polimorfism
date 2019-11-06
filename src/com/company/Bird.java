package com.company;

public abstract class Bird {
    protected String nameOfTheBird;
    protected String formOfTheBeak;
    protected int age;

    public Bird(String nameOfTheBird, String formOfTheBeak, int age) {
        this.nameOfTheBird = nameOfTheBird;
        this.formOfTheBeak = formOfTheBeak;
        this.age = age;
    }

    public String getNameOfTheBird() {
        return nameOfTheBird;
    }

    public void setNameOfTheBird(String classOfTheBird) {
        this.nameOfTheBird = classOfTheBird;
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