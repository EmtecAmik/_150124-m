package org.example._HW5;

public class ABC {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 8;


        if (a > b) {
            int tp = a;
            a = b;
            b = tp;
        }
        if (b > c) {
            int tp = b;
            b = c;
            c = tp;
        }
        if (a > b) {
            int tp = a;
            a = b;
            b = tp;
        }


        System.out.println(a + " " + b + " " + c);
    }



}
