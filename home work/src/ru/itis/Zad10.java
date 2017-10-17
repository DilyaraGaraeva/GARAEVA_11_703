package ru.itis;

import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int k = 0;
        int factorial = 1;
        double sum = ((( Math.pow((-1), k)) * (Math.pow(x, 2 * k + 1))) / (double)(factorial * ((2 * k) + 1)));
        k = 1;
        while (k <= n){
            sum = sum + ((( Math.pow((-1), k)) * (Math.pow(x, 2 * k + 1))) / (double)(factorial * ((2 * k) + 1)));
            k++; // увеличиваем к на 1
            factorial = factorial * k; // factorial dlya k
        }
        System.out.println(sum);

    }
   // никуда не годится


}
