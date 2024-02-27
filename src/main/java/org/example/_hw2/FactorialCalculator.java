package org.example._hw2;

public class FactorialCalculator {

//    public static void main(String[] args) {
//        if (args.length != 1) {
//            System.out.println("Usage: java FactorialCalculator <number>");
//            return;
//        }
//
//        int n = Integer.parseInt(args[0]);
//        int factorial = 1;
//        int i = 1;
//
//        while (i <= n) {
//            factorial *= i;
//            i++;
//        }
//
//        System.out.println("Factorial of " + n + " is: " + factorial);
//    }


//    public static void main(String[] args) {
//        if (args.length != 1) {
//            System.out.println("Usage: java FactorialCalculator <number>");
//            return;
//        }
//
//        int n = Integer.parseInt(args[0]);
//        int factorial = 1;
//        int i = 1;
//
//        do {
//            factorial *= i;
//            i++;
//        } while (i <= n);
//
//        System.out.println("Factorial of " + n + " is: " + factorial);
//    }



    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FactorialCalculator <number>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
    }

}
