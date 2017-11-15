package ru.itis;

public class Main {

    public static void main(String[] args) {
        double h = 0.05, x, b = -1, n = 9;
        double[] a = new double[3];
        a[0] = -0.04;
        a[1] = 2;
        a[2] = 1.96;
        double max, min;
        for (int i = 0; i < a.length; i++) {
            min = 1000000000;
            max = -1000000000;
            if (a[i] < 0) {
                for (int j = 0; j < n; j++) {
                    x = Math.log(1 + a[i] * a[i] + b + j * h) - 1;
                    if (min > x * x) {
                        min = x * x;
                    }
                    if (max < x * x) {
                        max = x * x;
                    }
                }
                System.out.println("При a" + (i + 1) + ":max y^2= " + max);
                System.out.println("При a" + (i + 1) + ":min y^2= " + min);
                System.out.println();
            } else {
                for (int j = 0; j < n; j++) {
                    x = Math.log(1 + 2 * a[i] + (b + i * h) * (b + j * h));
                    if (min > x * x) {
                        min = x * x;
                    }
                    if (max < x * x) {
                        max = x * x;
                    }
                }
                System.out.println("При a" + (i + 1) + ":max y^2= " + max);
                System.out.println("При a" + (i + 1) + ":min y^2= " + min);
                System.out.println();
            }
        }
    }
}



