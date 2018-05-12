package ru.itis;

import java.util.Random;

public class Human extends People {

    public Human () {
        Random random = new Random();
        String [] names = {"katy", "sasha", "masha"};
        name = names[random.nextInt(2)];

        while (weight < 2) {
            weight = random.nextInt(100);
        }
    }
}

