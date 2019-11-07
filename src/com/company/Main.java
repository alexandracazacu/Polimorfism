package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Bird> birds;
        birds = new ArrayList<Bird>();
        birds.add(new Chicken("Yellow", "short", 2));
        birds.add(new Crow("Black", "sharp", 9, 12));


        for (Bird bird : birds) {
            System.out.println(bird.toString());
            bird.sound();
        }
    }
}