package ru.itis;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random in = new Random();
        int count = 0,
                n = 10;
        int[] S = new int[n],
                T1 = new int[n];

        for (int i = 0; i < T1.length; i++) {
            T1[i] = in.nextInt(2);
            System.out.print(T1[i]);
        }
        System.out.println();

        for (int i = 0; i < T1.length; i++) {
            count += T1[i];
        }
        System.out.println(count);
    }
}
