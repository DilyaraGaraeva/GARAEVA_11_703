package ru.itis;

import java.util.Random;

public class Student {
    private boolean illness = false;
    private boolean chp = false;
    private boolean late = false;
    private Random random = new Random();
    private String lastName;
    private String [] lastNamesForRandomScript = {"mas", "os", "ni", "as"};

    public Student(){
       illness = random.nextBoolean();
       chp = random.nextBoolean();
       late = random.nextBoolean();
       lastName = lastNamesForRandomScript[new Random().nextInt(3)] + lastNamesForRandomScript[new Random().nextInt(3)] + lastNamesForRandomScript[new Random().nextInt(3)];
    }

    public String getLastName() {
        return lastName;
    }

    public String studentCome() {
        if (illness) {
            return "Illnes";
        }
        if (chp){
            return "Chp";
        }
        if (late){
            return "Late";
        }
        return "Come";
    }

}
