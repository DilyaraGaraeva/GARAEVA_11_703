package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
           int n = 0, p = 1;
            double t=1 , eps = 0.0001, s =0;
            while (Math.abs(t)>eps){
                s += t;
                n++;
                t=1.0/((2*n+1)*(2*n+1));
                p = -p;
            System.out.println(s);
	// write your code here
    }
}}
