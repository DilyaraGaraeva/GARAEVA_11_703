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

        int[] x1 = vectorX1(x);
        System.out.println("Один элемент из каждой цепочки: " + Arrays.toString(x1));
        int[] x2 = vectorX2(x);
        System.out.println("Исключаем одиночки: " + Arrays.toString(x2));
    }

    public static int[] vectorX1(int[] x) {
        int count = 1;
        for (int i = 1; i < x.length; i++) {
            if (x[i] != x[i - 1]) {
                count++;
            }
        }
        int[] x1 = new int[count];
        count = 1;
        x1[0] = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] != x[i - 1]) {
                x1[count] = x[i];
                count++;
            }
        }
        return x1;
    }

    public static int[] vectorX2(int[] x) {
        int count = x.length;
        for (int i = 1; i < x.length; i++) {
            if (x[i] != x[i - 1]) {
                if (i > 1 && x[i - 1] == x[i - 2] && i!=x.length-1) {
                    count++;
                }
                count--;
            }
        }

        int[] x2 = new int[count];
        count = 0;

        for (int i = 1; i < x.length; i++) {
            if (x[i] == x[i - 1]) {
                x2[count] = x[i];
                count++;
            }
            while (i < x.length && x[i] == x[i - 1] && count < x2.length) {
                x2[count] = x[i];
                count++;
                i++;
            }
        }
        return x2;
    }
}
