package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = sc.nextLine();
        System.out.println(uniqueCount(s.toCharArray()));
    }
    public static String uniqueCount(char[] x) {
        String result="";
        boolean countUnique = true;
        for (int i = 0; i < x.length; i++) {
            countUnique = true;
            for (int j = 0; j < x.length; j++) {
                if (x[j]==x[i] && j != i) {
                    countUnique = false;
                    break;
                }
            }
            if (countUnique) {
                result+=x[i];
            }
        }
        return result;
    }
}
