package ru.itis;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();

        ArrayList<People> listOfPeople = new ArrayList<>();

        listOfPeople.add(human1);
        listOfPeople.add(human2);

        MovePeopleController movePeopleController = new MovePeopleController(listOfPeople);
        movePeopleController.start();

    }


}




