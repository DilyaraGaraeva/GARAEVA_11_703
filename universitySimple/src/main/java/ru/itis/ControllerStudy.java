package ru.itis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class ControllerStudy {
    private ArrayList<Student> studentArrayList;
    private short countStudentTrue;
    private Journal journal;

    public void setStudent(ArrayList<Student> studentArrayList) {
        this.studentArrayList = studentArrayList;
        journal = new Journal();
    }

    public void start() {
        for (int i = 0; i < studentArrayList.size(); i ++) {
            if (studentArrayList.get(i).studentCome().equals("Come")) {
                countStudentTrue ++;
            }
            else {
                journal.noteNotComing(studentArrayList.get(i).getLastName(), studentArrayList.get(i).studentCome());
            }
        }
        System.out.println("Количество студентов пришедших на занятие = " + countStudentTrue);

//        Map studentMapNotComing = journal.getStudentMapNotComing();     //:TODO Доделать вывод
//        for (int i=0; i < studentMapNotComing.size(); i++){
//            Collection lastname = studentMapNotComing.values();
//        System.out.println(lastname.iterator().hasNext());
        //System.out.println("Студнты которые не пришли на занятие " + lastname);

                //System.out.println("Студенты, которых нет: " + "Причина - " + );



        }



    }


