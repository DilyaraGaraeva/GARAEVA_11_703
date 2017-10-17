package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n, p ;
        n = 1; p = 1;
        double eps = 0.0001;
        double g = 0 , t=1, x;
        x = in.nextDouble();
        t=x;
        while (Math.abs(t)>eps){
            t = t * (-p) * x * x / (2 * n + 1);
            g = g + t;
            p = -p;
            System.out.println(n);
            System.out.println(g);
            n++;
            System.out.println(n);
        }
        System.out.println(g);
    }
}
