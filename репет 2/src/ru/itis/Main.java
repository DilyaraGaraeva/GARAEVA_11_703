package ru.itis;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        int month = 2;
        Scanner in = new Scanner(System.in);
        month = in.nextInt();
       /* switch (month) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            default:
                System.out.println("Такого месяца нет");
                break;

        }
        */
        //System.out.println(month % 2);
        int d[] = {1, 7, 3, 8, 5, 6};
        boolean flag = false;
        for (int i =0; i< d.length; i++){
            if (d[i] == month) {
                System.out.println(i+1);
                flag = true;
            }
            else {
                flag = false;
            }

        }
        if (flag = false ){
            System.out.println("Такого числа нет");
        }

    }
}
