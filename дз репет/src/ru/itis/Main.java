package ru.itis;

public class Main {

    public static void main(String[] args) {
        int d[] = {1,2,3, 6, 32,74, 8, 23};
        int buf = 0;
        for (int j = d.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (d[i] > d[i + 1]) {
                    buf = d[i];
                    d[i] = d[i + 1];
                    d[i + 1] = buf;
                }
            }
        }
    }
}