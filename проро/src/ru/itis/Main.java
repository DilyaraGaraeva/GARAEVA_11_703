//задание 30А
package ru.itis;

public class Main {

    public static void main(String[] args) {
        int n ;
            n=1;
        double  eps = 0.0001, a = 1.0 - 1.0 - 0.002, x0, x1;
        double a1 = 20 * 1.0;
        if ((a * a1) > 0)
            x0 = 1.0;
        else
            x0 = 1.1;
        x1 = x0 - ((x0*x0*x0*x0*x0) / (5 * x0*x0*x0*x0 - 1));
        double xOld = x0;
        while (Math.abs(xOld - x1) >= eps){
            x1 = x0 - ((x0*x0*x0*x0*x0) / (5 * x0*x0*x0*x0 - 1));
            xOld = x0;
            x0 = x1;
            n++;
        }
        System.out.println(n);
    }
}