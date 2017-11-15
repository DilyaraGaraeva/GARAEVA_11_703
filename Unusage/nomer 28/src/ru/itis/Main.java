package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a0, b0, x,a1,  b1, eps = 0.0001;

        x =in.nextDouble();
        a0=x; b0 = 1-x; a1 = a0*(1+b0/2); b1= (b0*b0)*(3+b0);
        while (b1 >eps){
            a0=a1;
            b0=b1;
            a1 = a0*(1+b0/2) ;
            b1=  (b0*b0)*(3+b0);


        }
        System.out.println(a1);

    }
}

