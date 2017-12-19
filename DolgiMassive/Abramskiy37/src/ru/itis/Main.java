package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("ведите матрицу nxn :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        makeTriangle(matrix);
        System.out.println("Результат : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void makeTriangle(int [][] matrix){
        for(int i = 0;i<matrix.length/2;i++){
            for (int j = i+1;j<matrix.length-(i+1);j++){
                matrix[i][j]=0;
                matrix[matrix.length-(i+1)][j]=0;
            }
        }
    }
}
