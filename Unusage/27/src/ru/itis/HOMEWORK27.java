package ru.itis;

import java.util.Scanner;
public class HOMEWORK27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double e, x, a0, b0, a1,b1;
                e = 0.0001;
                x = in.nextDouble();
                a0 = x;
                b0 = 1 - x;

        a1 = a0*(1 + b0/2);
        b1 = b0*b0*(3 + b0);
        while(Math.abs(b1) > e){
            a0 = a1;
            b0 = b1;
            a1 = a0*(1 + b0/2);
            b1 = b0*b0*(3 + b0);
        }

        System.out.println(a1);
    }
}

