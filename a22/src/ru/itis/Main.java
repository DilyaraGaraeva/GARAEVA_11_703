package ru.itis;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 5, s = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int)Math.round(Math.random()*20)-10;
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                s += a[i];
            }
        }
        System.out.println(s);
    }
}
