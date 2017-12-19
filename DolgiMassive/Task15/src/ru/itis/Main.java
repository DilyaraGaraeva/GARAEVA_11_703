package ru.itis;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Количество чисел в последовательности: ");
        int n = sc.nextInt();
        int[] x = new int[n];
        System.out.println("Последовательность: ");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        System.out.println("Самая маленькая цепочка " + min(x));
        System.out.println("Самая длинная цепочка " + max(x));
        System.out.println("Вектор u " + Arrays.toString(vectorU(x)));
    }

    public static int min(int x[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < x.length; i++) {
            int t = 1;
            while (i < x.length - 1 && x[i] <= x[i + 1]) {
                t++;
                i++;
            }
            if (t < min) {
                min = t;
            }
        }
        return min;
    }

    public static int max(int x[]) {
        int max = 0;
        for (int i = 0; i < x.length; i++) {
            int t = 1;
            while (i < x.length - 1 && x[i] <= x[i + 1]) {
                t++;
                i++;
            }
            if (t > max) {
                max = t;
            }
        }
        return max;
    }

    public static int[] vectorU(int x[]) {
        int[] u = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            int t = 0;
            while (i < x.length - 1 && x[i] <= x[i + 1]) {
                t++;
                i++;
            }
            u[t]+=1;
        }
        return u;
    }
}
