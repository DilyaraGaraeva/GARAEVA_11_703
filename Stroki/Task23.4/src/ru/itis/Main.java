package ru.itis;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите двоичное число ");
        String text = sc.nextLine();
        while (isBinaryString(text)!=true){
            System.out.println("Ввод неверен введите двоичное число ");
            text = sc.nextLine();
        }
        System.out.println("Десятичное число "+Integer.parseInt(text,2));
    }
    public static boolean isBinaryString(String text){
        String t = "((0|1).*)";
        Pattern pattern = Pattern.compile(t);
        Matcher reg = pattern.matcher(text);
        return reg.matches();
    }
}
