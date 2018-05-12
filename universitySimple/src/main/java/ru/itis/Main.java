package ru.itis;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<Student>();

        for (int i = 0; i < 21; i++) {
            Student student = new Student(); //так можно
            studentArrayList.add(student);
            //studentArrayList.add(new Student());    //но так правильнее
        }

        ControllerStudy controllerStudy = new ControllerStudy();
        controllerStudy.setStudent(studentArrayList);
        controllerStudy.start();
    }
}
