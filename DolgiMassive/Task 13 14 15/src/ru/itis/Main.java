package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите N");
        int n = sc.nextInt();
        System.out.println("Знакопеременная сумма :"+sum(n));
        System.out.println("Количество цифр :" + Integer.toString(n).length());
        System.out.println("Число M =" + createM(n));
    }
    public static int sum(int n){
        String s = Integer.toString(n);
        int result = 0;
        char[] l = s.toCharArray();
        boolean sign = true;
        for(int i = 0;i<l.length;i++){
            if (sign) {
                result += l[i];
                sign = !sign;
            }
            else {
                result -= l[i];
                sign = !sign;
            }
        }
        return result;
    }
    public static int createM(int n){
        String s = Integer.toString(n);
        String result="";
        char[] l = s.toCharArray();
        for(int i =0;i<l.length;i++){
            if(l[i]%2!=0){
                result=result+Character.toString(l[i]);
            }
        }
        return Integer.parseInt(result);
    }
}
