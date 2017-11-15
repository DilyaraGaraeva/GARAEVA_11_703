package ru.itis;

public class Main {

    public static void main(String[] args) {
        int [] a = {2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 6, 7};
        int k;
        k=0;
        if (a[0]!=a[1]) {
            k++;
        }

        if (a[a.length-1]!=a[a.length-2]) {
            k++;
        }

        for (int i = 1; i<=a.length-2; i++) {
            if (a[i]!=a[i+1]&&a[i]!=a[i-1]) {
                k++;
                int [] w = new int [k];
            }
            else {
                int [] w = new int [0];

            }

        }
        System.out.println (w[]);
    }
}

