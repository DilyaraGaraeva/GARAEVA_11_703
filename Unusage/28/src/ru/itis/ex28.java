package ru.itis;//+
import java.util.Scanner;
public class ex28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, b0, b1, a0, a1, e;
                x = in.nextDouble();
                b0 = 1 - x;
                a0 = x;
                e = 0.0001;

        a1 = a0*(1 + b0/2);
        b1 = b0*b0*(3 + b0);

        while(b1 > e){
            a0 = a1;
            b0 = b1;
            a1 = a0*(1 + b0/2);
            b1 = b0*b0*(3 + b0);
        }

        System.out.println(a1);
    }
}
