package ru.itis;
import java.util.Scanner;
public class ex29b {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i = 1;
        double e, x0, x1;
        x0 = 0;
        e = 0.0001;
        x1 = Math.cos(x0);
        while(Math.abs(x0 - x1) > e){
            x0 = x1;
            x1 = Math.cos(x0);
            i++;
        }
        System.out.println(i);
    }
}
