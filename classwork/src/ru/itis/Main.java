package ru.itis;

import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n , s = 0;
        n = 10;

	int [] a = new int [n];
    int [] b = new int [n];
    Random rand = new Random();
    for (int i = 0; i < n; i++) {
        a[i] = rand.nextInt(10);
        b[i] = rand.nextInt(10);
        s += a[i] * b[i];
        }


    }
}
