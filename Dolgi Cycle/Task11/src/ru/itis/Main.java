package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i = 1;
        n = sc.nextInt();
        double S = 1, el = 1;
        while (i <= n) {
            el *= Math.sin(i) / Math.cos(i);
            S *= el;
            i++;

        }
        System.out.println(S);
    }
}

