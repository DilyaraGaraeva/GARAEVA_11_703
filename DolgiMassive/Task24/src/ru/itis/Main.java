package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n");
        int n = sc.nextInt();
        System.out.println("Если m = 2*n+1 свойство :" + firstCase(n));
        System.out.println("Если m = 2*n+2 свойство :" + secondCase(n));
    }

    public static int fibonacci(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return (fibonacci(num - 1) + fibonacci(num - 2));
    }

    public static boolean firstCase(int n) {
        int m = 2 * n + 1;
        int left = fibonacci(m);
        int right = 1;
        for (int i = 2; i < 2 * n; i += 2) {
            right += fibonacci(i);
        }
        return (left == right);
    }

    public static boolean secondCase(int n) {
        int m = 2 * n + 2;
        int left = fibonacci(m);
        int right = 0;
        for (int i = 1; i < 2 * n+1; i += 2) {
            right += fibonacci(i);
        }
        return (left == right);
    }
}
