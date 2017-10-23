package ru.itis;
import java.util.Scanner;
public class homework29a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i = 0;
        double x, e, y0, y1;
                x = in.nextDouble();
                e = 0.0001;
        if(x >= 1) y0 = x/3; else y0 = x;
        y1 = y0 -(y0 - x/(y0*y0))/3;

        while(Math.abs(y0 - y1) > e) {
            y0 = y1;
            y1 = y0 -(y0 - x/(y0*y0))/3;
            i++;
        }
        System.out.println(i);
        System.out.println(y1);
    }
}
