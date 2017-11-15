package ru.itis;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double U1, U2, V1, V2;
        int n = in.nextInt();
        U1 = U2 = 0; V1 = V2  = 0;
        double U;
        U = 0;
        int i;
        for (i = 3; i<= n;  i++) {
            U = (U2 - (U1 * V2) - V1) / (1.0 + (U2 * V2) + (U2 * V2));
            U2 = U1;
            U1 = U;
        }

        System.out.println(U);


    }

}


