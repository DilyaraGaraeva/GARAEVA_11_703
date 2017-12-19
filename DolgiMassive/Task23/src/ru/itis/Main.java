package ru.itis;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Количество чисел в векторе: ");
        int n = sc.nextInt();
        double[] x = new double[n];
        System.out.println("Вектор: ");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextDouble();
        }
        System.out.println("Введите t: ");
        int t = sc.nextInt();
        System.out.println("Введите a: ");
        double a = sc.nextDouble();
        System.out.println("Введите h: ");
        double h = sc.nextDouble();

        System.out.println("Вектор S первый случай: " + Arrays.toString(vectorS(x,t,a,h)));
        System.out.println("Вектор S второй случай: "+ Arrays.toString(vectorS(x,t,x[0],(x[x.length-1]-x[0])/(t-1))));


    }

    public static int[] vectorS(double[] x, int t, double a, double h) {
        int[] s = new int[t];
        for (int i = 1; i <= t; i++) {
            int count = 0;
            for (int j = 0; j < x.length; j++) {
                if (x[j] >= (a + (i - 1) * h) && x[i] < (a + j * h)) {
                    count++;
                }
            }
            s[i - 1] = count;
        }
        return s;
    }

}