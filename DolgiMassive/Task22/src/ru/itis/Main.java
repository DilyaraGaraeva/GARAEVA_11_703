package ru.itis;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Количество чисел в векторе: ");
        int n = sc.nextInt();
        int[] x = new int[n];
        System.out.println("Вектор: ");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        System.out.println("Числа упорядочены: " + isSorted(x));
        System.out.println("Есть одинаковые: " + haveEquals(x));
        System.out.println("Уникальных чисел: " + uniqueCount(x));
        System.out.println("Простых Чисел: " + countPrimeNum(x));
    }

    public static boolean isSorted(int[] x) {
        boolean sorted = true;
        for (int i = 1; i < x.length; i++) {
            if (x[i] > x[i - 1]) {
                sorted = false;
                break;
            }
        }
        if (!sorted) {
            sorted = true;
            for (int i = 1; i < x.length; i++) {
                if (x[i] < x[i - 1]) {
                    sorted = false;
                    break;
                }
            }
        }
        return sorted;
    }

    public static boolean haveEquals(int[] x) {
        for (int i = 1; i < x.length; i++) {
            if (x[i - 1] == x[i]) {
                return true;
            }
        }
        return false;
    }

    public static int uniqueCount(int[] x) {
        int result = 0;
        boolean countUnique = true;
        for (int i = 0; i < x.length; i++) {
            countUnique = true;
            for (int j = 0; j < x.length; j++) {
                if (x[j] == x[i] && j != i) {
                    countUnique = false;
                    break;
                }
            }
            if (countUnique) {
                result++;
            }
        }
        return result;
    }

    public static int countPrimeNum(int[] x) {
        int result = 0;
        for (int i = 0; i < x.length; i++) {
            BigInteger bigInteger = BigInteger.valueOf(x[i]);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(x[i]));
            if (probablePrime) {
                result++;
            }
        }
        return result;
    }
}
