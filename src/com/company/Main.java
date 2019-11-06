package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Bird> birds;
        birds = new ArrayList<Bird>();
        birds.add(new Chicken("Crow", "short", 2));
        birds.add(new Crow("Chicken", "sharp", 9, 12));


        for (Bird bird : birds) {
            System.out.println(bird.toString());
            bird.sound();
        }
    }
}