package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        Scanner a = new Scanner(System.in);
        int n=1;
        double eps = 0.0001;
        double g , t, m, x;
        g = 0; t = 1; m = 1;
        x = a.nextInt();
        while (Math.abs(t)>eps){
            g = g + t;
            t = t*(-1)*m/(2*n);
            m = m*x*x;
            n++;
            System.out.println(n);
        }
        System.out.println(g);
    }
}
