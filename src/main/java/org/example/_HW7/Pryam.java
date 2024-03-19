package org.example._HW7;

public class Pryam {

    public static void main(String[] args) {
        int M = 5;
        int N = 10;


        System.out.println("Прямоугольник из звездочек:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("\nПрямоугольник с пустым внутренним пространством:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == M - 1 || j == 0 || j == N - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
