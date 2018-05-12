package ru.itis;

import java.util.Random;

public abstract class People{
    protected int weight;
    protected String name;

    public People() {
        new Random();
    }



    public void doGoing() {
        System.out.println(name + " Я пошел");
    }

}

