package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double s, x, k , t, eps = 0.0001, pow;
        s = 0;
        k =1;
        t = 1;
        pow = -1;
        x = in.nextDouble();
        while (t >= eps) {
            s += t * pow * (Math.sin(t * x) * Math.sin(t * x));
            t *= 1.0 / k;
            pow = -pow;
            k++;
        }
        System.out.print(s);
    }
}


