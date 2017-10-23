package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 1, p = 1;
        Scanner in;
        int x = in.nextInt();
        double t=1 , eps = 0.0001, s =0;
        while (Math.abs(t)<eps){
            s += t;
            n++;
            t=x*x/()*(2*n+1));
            p = -p;
            System.out.println(s);
        }
    }
}
