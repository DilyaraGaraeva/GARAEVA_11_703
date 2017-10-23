package ru.itis;
import java.util.Scanner;
public class homework10B {
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        int p;
        p = 1;
        int x = in.nextInt(),
        n = in.nextInt();
        double t = x - 0.1, sum = 0;

        for (int k = 2; k <= n; k++) {
            t *= (x * x * x * x) / ((2 * (double)k -1) * (2 * (double)k) * (4 * (double)k + 1));
            sum = sum + (t * p);
            p = -p;
        }
        if (n > 2)
            System.out.println(x + sum );
        else
            System.out.println(t);
    }
}

