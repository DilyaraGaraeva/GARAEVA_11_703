package ru.itis;
// Задание 13
         import java.util.Scanner;
public class Main {
 static Scanner in = new Scanner(System.in);
     public static void main(String[] args) {
                int n = in.nextInt();
                int t = 1, m, sum = 0;
                while (n > 0){
                        m = n % 10;
                        sum += t * m;
                        n /= 10;
                        t = -t;
                    }
             System.out.println(sum);
            }
 }