package ru.itis;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double y0, x, y1, eps = 0.0001;
        x = in.nextDouble();

        if (x >= 1) {
            y0 = x / 3;
        } else {
            y0 = x;
        }
        y1 = y0 - 1 / 3.0 * (y0 - x / (y0 * y0));
        while (Math.abs(y1 - y0) > eps) {
            y0 = y1;
            y1 = y0 - 1 / 3.0 * (y0 - x / (y0 * y0));

        }
        System.out.println(y1);
    }

}


