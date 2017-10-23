package ru.itis;
import java.util.Scanner;
public class homework32B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        double e, x1, a, x0;
                e = 0.0001;
                a = in.nextDouble();
                x0 = a;
        x1 = 1 + 9 * Math.sin(x0)/2;

        while (Math.abs(x0 - x1) > e){
            x0 = x1;
            x1 = 1 + 9 * Math.sin(x0)/2;
            i++;
        }
        System.out.println(x1);
    }
}
