package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1.) Дана матрица, элементы первого столбца которой упорядочены по не возрастанию. Вставить в матрицу строку так, чтобы не нарушилась упорядоченность по первому столбцу.
        //2.) Проверить, имеются ли в матрице 2 совпадающие строки.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Введите матрицу nxn :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Введите массив размера n :");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        matrix = insert(matrix, array);
        System.out.println("Вставка строки: ");
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Совпадающие строки: "+isHaveEquals(matrix));
    }

    public static int[][] insert(int[][] m, int[] ar) {
        int[][] result = new int[m.length + 1][m.length];
        boolean in = false;
        boolean last = false;
        int count = 0;
        for (int i = 0; i < result.length; i++) {
            if (i == result.length - 1) {
                last = !last;
            }
            if (!last && !in && ar[0] > m[i][0]) {
                for (int j = 0; j < result.length - 1; j++) {
                    result[i][j] = ar[j];
                }
                i++;
                in = !in;
            }
            if (last && !in) {
                for (int j = 0; j < result.length - 1; j++) {
                    result[i][j] = ar[j];
                }
                break;
            }
            for (int j = 0; j < result.length - 1; j++) {
                result[i][j] = m[count][j];
            }
            count++;
        }
        return result;
    }

    public static boolean isHaveEquals(int [][] m){
        boolean res = true;
        for(int i = 1;i<m.length;i++){
            res = true;
            for(int j =0;j<m[i].length;j++){
                if(m[i-1][j]!=m[i][j]){
                    res = false;
                }
            }
            if(res) return res;
        }
        return res;
    }
}
