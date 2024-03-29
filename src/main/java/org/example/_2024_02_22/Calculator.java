////package org.example._2024_02_22;
//////
//////import java.util.Scanner;
//////
//////public class Calculator {
//////    public static void main(String[] args) {
//////        double num1 = getNumber();
//////        double num2 = getNumber();
//////        char operation = getOperation();
//////        double result = calculate(num1, operation, num2);
//////        System.out.println(result);
//////    }
//////
//////    public static double getNumber() {
//////        Scanner scanner = new Scanner(System.in);
//////        System.out.println("Enter number");
//////        return scanner.nextDouble();
//////    }
//////
//////    public static char getOperation() {
//////        Scanner scanner = new Scanner(System.in);
//////        System.out.println("Enter operation:");
//////        return scanner.next().charAt(0);
//////    }
//////
//////    public static double calculate(double num1, char operation, double num2) {
//////        switch (operation) {
//////            case '+':
//////                return num1 + num2;
//////            case '-':
//////                return num1 - num2;
//////            case '*':
//////                return num1 * num2;
//////            case '/':
//////                return division(num1, num2);
//////            default:
//////                System.out.println("Error");
//////                System.exit(0);
//////                return 0;
//////        }
//////    }
//////
//////    public static double division(double number1, double number2) {
//////        if (number2 == 0) {
//////            System.out.println("Error! Division by zero");
//////            System.exit(0);
//////        }
//////        return number1 / number2;
//////    }
//////}
////
////
////
////
////// 23.02
////
////public class Main {
////
//    public static void main(String[] args) {
//        System.out.println("Hello world");
//
//        String myChar = 'A';
//
//        switch () {
//            case 'A':
//                myChar = 'a';
//                break;
//
//
//            case 'B':
//                myChar = 'b';
//                break;
//
//            case 'A':
//                myChar = 'c';
//                break;
//
//        }
//
//    }
//}
//
//
//
//
//
//    private static void printGreetings(String greetings) {
//        switch (greetings) {
//            case "Hi":
//                System.out.println("Hi all");
//                break;
//            case "Hello":
//                System.out.println("Hello all people");
//                break;
//            case "Welcome":
//                System.out.println("Welcome to all");
//                break;
//            default:
//                System.out.println("Ups!");
//        }
//    }
//
