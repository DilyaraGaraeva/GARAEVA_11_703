package ru.itis;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        int[] x = new int[n];
        int[] y = new int[n];
        int[] z = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            x[i] = r.nextInt(10);
        }
        for (int i = 1; i < n; i++) {
            if (x[i] * x[i - 1] < 0) {
                y[i] = 1;
            } else {
                y[i] = 0;
            }
            if (x[i - 1] > x[i]) {
                z[i] = 1;
            } else {
                z[i] = 0;
            }
        }
        for (int i = 1; i < n; i++) {
            System.out.println(y[i]);
        }
        for (int i = 1; i < n; i++) {
            System.out.println(z[i]);
        }

    }}
