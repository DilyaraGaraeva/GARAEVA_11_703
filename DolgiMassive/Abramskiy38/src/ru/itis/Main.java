package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = sc.nextInt();
        double[][] matrix = new double[n][n];
        System.out.println("Введите матрицу nxn :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        makeTriangle(matrix);
        System.out.println("Результат" + " : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(String.format("%.2f", matrix[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public static void makeTriangle(double[][] matrix) {
        double t;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                t = matrix[j][i] / matrix[i][i];
                for (int k = 0; k < matrix.length; k++) {
                    matrix[j][k] -= t * matrix[i][k];
                }
            }
        }
    }
}
