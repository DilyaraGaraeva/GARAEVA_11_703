package ru.itis;

import java.util.Scanner;
public class ex13 {
    static Scanner in = new Scanner(System.in);
     public static void main(String[] args) {
        int num = in.nextInt();
        int p = 1, mod, sum = 0;
        while (num > 0){
            mod = num % 10;
            sum += p * mod;
            num /= 10;
            p = -p;
        }
        System.out.println(sum);
    }
}
