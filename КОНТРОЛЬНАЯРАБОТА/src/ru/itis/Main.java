package ru.itis;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
     int U1, U2;
        int i = in.nextInt();
        U1 = U2 = 0;
        int U;
        U = (U2 - (U1*U2) - U1) / (1 + (U2 * U2) + (U2 * U2));
        for (i >= 3, i++) {
            U = (U2 - (U1*U2) - U1) / (1 + (U2 * U2) + (U2 * U2));
            U2 = U1;
            U = U2;

        }

        System.out.println(U);



}

}
