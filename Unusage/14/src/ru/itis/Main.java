//задание 14
package ru.itis;
import java.util.Scanner;
public class Main{
   static Scanner in = new Scanner(System.in);

            public static void main(String[] args) {
                int n = in.nextInt();
                int j = 0;
                for(int i = 1; n > 0; i++){
                        n /= 10;
                        j = i;
                    }
             System.out.println(j);
            }
 }