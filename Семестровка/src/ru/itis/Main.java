package ru.itis;

public class Main {

    public static void main(String[] args) {
        double y, u0 = 1.0, u = 0.0, e = 2.71828;
        double[] x = {-0.2, 0.8, 5.9};
        int n = 20;
        for (int i = 0; i < x.length; i++) {
            y = Math.pow(e, -x[i] * x[i] + 2 * x[i] - 0.8) * (x[i] - 3.5);
            for (int z = 0; z < n; z++) {
                u = (2.0 / 3) * u0 + (y) / (3 * u0 * u0);
                u0 = u;
            }
            System.out.println("y" + (i + 1) + "=" + u);
        }
    }
}


