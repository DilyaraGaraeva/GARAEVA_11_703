package ru.itis;

public class Main {

    public static void main(String[] args) {
        int [] a = {2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 6, 7};
        int [] b = new int [a.length];

        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] != a[i + 1] && a[i] != a[i - 1]) {
                b[i]=a[i];
            }
            else {
                b[i]=0;
            }
            System.out.print(b[i]);
        }
        if (a[0]!=a[1]) {
            b[0] = a[1];
            System.out.print(b[0]);
        }

        if (a[a.length-1]!=a[a.length-2]) {
            b[a.length-1] = a[a.length-1];
            System.out.print (b[a.length-1]);
        }
    }
}
