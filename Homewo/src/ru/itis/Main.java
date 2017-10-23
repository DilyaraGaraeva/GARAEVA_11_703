package ru.itis;//-

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int k = 1;
        int fac = 1;
        int umn1 = 1;
        int umn2 = x;


        double sum = x;
        while (k <= n){
            sum = sum + (umn1 * umn2) / (double)(fac * ((2 * k) + 1)));
            k++;
            umn1 *= -1;
            umn2 = umn2 * x * x;


            fac = k*fac;
        }
        System.out.println(sum);

    }}
