package org.example._HWF;

public class Ob {

    public static void main(String[] args) {
        double a = 2.0;
        double b = -7.0;
        double c = 3.0;


        double discriminant = b * b - 4 * a * c;


        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("У уравнения два вещественных корня:");
            System.out.println("Корень 1: " + root1);
            System.out.println("Корень 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("У уравнения один вещественный корень:");
            System.out.println("Корень: " + root);
        } else {
            System.out.println("У уравнения нет вещественных корней.");
        }
    }



}
