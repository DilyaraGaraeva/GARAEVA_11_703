package ru.itis;

        public class Main {

             public static void main(String[] args) {
                int n = 1;
                double eps = 0.0001, x1 = 0;
                double x = Math.cos(x1);
                double x0 = x1;
                x0 = x;
                while (Math.abs(x * x0) >= eps) {
                        x = Math.cos(x1);
                        x0 = x1;
                        x1 = x;
                        n++;
                }
                 System.out.println("value: " + n);
             }
        }