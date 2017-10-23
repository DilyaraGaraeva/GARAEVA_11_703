package ru.itis;

import java.util.Scanner;

class Main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int k = 1;
        int fac = 1;
        int pow1 = 1;
        int pow2 = x;
        double t=1;

        double sum = x;
        while (k <= n){
            t = t *x*x*(2*(k-1)+1)/(k*(2*k+1));
            sum += pow1*t;
            k++;
            pow1 *= -1;

        }
        System.out.println(sum);
    }
}