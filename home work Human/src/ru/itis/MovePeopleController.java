package ru.itis;

import java.util.ArrayList;

public class MovePeopleController {
    ArrayList<People> listOfPeople;
//    private boolean doGoing;

//    public boolean peopleGoing(ArrayList<People> listOfPeople) {
//        for (int i = 0; i < listOfPeople.size(); i++) {
//            if (doGoing) {
//                return true;
//                System.out.println(listOfPeople.name + "я пошел");
//            }
//
//            return false;
//        }
//
//    }

    public MovePeopleController(ArrayList<People>listOfPeople) {
        this.listOfPeople = listOfPeople;
    }

       public void start() {
           for (int i = 0; i < listOfPeople.size(); i++) {
                listOfPeople.get(i).doGoing();

           }
       }
}