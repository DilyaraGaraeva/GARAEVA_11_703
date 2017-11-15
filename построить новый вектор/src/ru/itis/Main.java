package ru.itis;

public class Main {

    public static void main(String[] args) {
        int [] a = {2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 6, 7};
        int [] w = new int [a.length];
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] != a[i + 1] && a[i] != a[i - 1]) {
                w[i]=a[i];
            }
            else {
                w[i]=0;
            }
            System.out.print(w[i]);
        }

        if (a[a.length-1]!=a[a.length-2]) {
            w[a.length-1] = a[a.length-1];
            System.out.print (w[a.length-1]);
        }
    }
}
