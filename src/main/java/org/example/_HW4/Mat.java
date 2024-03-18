package org.example._HW4;

import java.util.Scanner;

public class Mat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();


        System.out.println("Результат сложения: " + add(num1, num2));
        System.out.println("Результат вычитания: " + sub(num1, num2));
        System.out.println("Результат умножения: " + mult(num1, num2));
        System.out.println("Результат деления: " + div(num1, num2));

        scanner.close();
    }


    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double sub(double num1, double num2) {
        return num1 - num2;
    }

    public static double mult(double num1, double num2) {
        return num1 * num2;
    }

    public static double div(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("на ноль делить нельзя");
            return Double.NaN;
        } else {
            return num1 / num2;
        }
    }



}
