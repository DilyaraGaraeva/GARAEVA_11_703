package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*
        int a, b, i;
        a = 5;
        b = 6;
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        for ( i = 0; i < 4; i++) {
            System.out.println("stroka " + (i + 1));
        }
        i = 0;
        while (i <4){
            System.out.println("stroka " + (i + 1));
                    i++;
        }*/
        int k[] = new int[10];
        for (int j = 0; j < k.length; j++) {
            k[j] = (int) (Math.random() * 10);
            System.out.print(k[j] + " ");
        }
        System.out.println();
        int d[] = {1, 7, 3, 8, 5, 6};
        int buf = 0;
        for (int j = d.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (d[i] > d[i + 1]) {
                    buf = d[i];
                    d[i] = d[i + 1];
                    d[i + 1] = buf;
                }
            }
        }


        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");

        }
        System.out.println();
        int o = 0;
        for (int l = 0; l < d.length; l++) {
            if (d[l] % 2 == 0) {
                o++;
            }
        }
        System.out.println(o);
        System.out.println("Введите число");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("вы ввели число : " + num);

        int mas[][] = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                mas[i][j] = (int) (Math.random() * 100);
                System.out.print(mas[i][j] + " ");

            }
            System.out.println();
        }
        int max = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (mas[i][j] > max) {
                    max = mas[i][j];
                }
            }
            System.out.println("Максимальный элемент " + i + " строки: " + max);
        }
        int mas2[][] = {
                {0, 0, 0},
                {0, 0, 0}
        };

        System.out.println("Вводим элементы массива");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                mas2[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mas2[i][j] + " ");
            }
            System.out.println();
        }
    }


}