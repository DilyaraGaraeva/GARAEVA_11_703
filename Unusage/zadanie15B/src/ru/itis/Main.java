package ru.itis;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {1, 2, 5, 4, 5, 7, 7, 12, 12, 12};
        int[] u = new int[10];
        int k = 0,
                j = 0;
        boolean flag = false;

        while (a[j] < a[j + 1]) {
            j++;
        }
        j++;
        for (int i = j; i < a.length - 1; i++) {
            if (a[i] <= a[i + 1]) {
                k++;
            } else {
                k++;
                u[k]++;
                k = 0;
            }
        }
        if (a[a.length - 2] < a[a.length - 1]) {
            k++;
            u[k]++;
        }
        System.out.println(Arrays.toString(u));
        System.out.println(k);
    }
}


