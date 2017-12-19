package ru.itis;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n , p, l;
        n = 1; p = 1;
        double g , t, m, x;
        g = 0; t = 1; m = 1;
        double eps = 0.0001;
        x = in.nextDouble();
            while (Math.abs(t)>eps){
            g = g + t;
            t = t * (x/n);
            n++;
            System.out.println(n);
        }
        System.out.println(g);
    }
}
