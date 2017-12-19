package ru.itis;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Количество чисел в последовательности: ");
        int n = sc.nextInt();
        int[] x = new int[n];
        System.out.println("Упорядоченная последовательность: ");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        int[] y = vectorY(x);
        System.out.println("вектор y: " + Arrays.toString(y));
        int[] v = vectorV(x);
        System.out.println("вектор v: " + Arrays.toString(v));

    }

    public static int[] vectorY(int[] x) {
        int[] y = new int[x.length];
        y[0] = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] != x[i - 1]) {
                y[i] = x[i];
            } else {
                y[i] = 0;
            }
        }
        return y;
    }

    public static int[] vectorV(int[] x) {
        int[] v = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            v[i] = 0;
        }
        int count = 0;
        for (int i = 1; i < x.length; i++) {
            if (x[i] == x[i - 1]) {
                count++;
            } else {
                v[count] += 1;
                count = 0;
            }
        }
        v[count] += 1;
        return v;
    }
}
