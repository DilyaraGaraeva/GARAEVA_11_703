package ru.itis;

import java.util.Scanner;
public class Main {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt(), x = 0,  z = 0, kon = 0, n1 = n;
               for (int i = 1; n > 0; i++) {
                     n /= 10;
                   kon = i;
                    }
                int[] a = new int[kon];

            for (int k = 0; k < a.length; k++) {
                        z = n1 % 10;
                        if (z % 2 != 0)
                                a[k] = z;
                       n1 /= 10;
                    }

                        for(int i = a.length - 1; i >= 0; i--){
                        if (a[i] != 0)
                            x = x * 10 + a[i];
                    }
                System.out.println(x);
            }
 }