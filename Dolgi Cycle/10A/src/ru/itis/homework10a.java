package ru.itis;
import java.util.Scanner;
public class homework10a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    int p = -1;
   double sum = 0;

    public static void main(String[] args) {
        int x = in.nextInt();
        int n = in.nextInt();
        double t = x;

        for (int k = 1; k <= n; k++){
            sum += t;
            t *= (double)p * (((double)x * (double)x) / ((double)k * (2 * (double)k + 1)));
            p = -p;
        }
        System.out.println(sum + t);



    }
}
