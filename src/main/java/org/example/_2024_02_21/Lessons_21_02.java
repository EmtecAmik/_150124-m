//package org.example._2024_02_21;
//
//public class Lessons_21_02 {
//    public static void main(String[] args) {
        //        Вывести на экран в одну строку все нечётные числа от 0 до 100.
//        for (int i = 1; i < 100; i = i + 2) {
//            if (i % 2 == 1)
//                System.out.println(i);
//        }
//        i = 1;
//        while (i < 100) {
//            System.out.print(i + " ");
//            i = i + 2;
//        }
//        Дано 5 чисел:  а=10,  b=15, c= 20, d=25, e=30.
//        Переприсвоить и вывести их на экран в том же порядке(a,b,c,d,e), НО, таким образом, чтобы каждая переменная принимала “следующее” значение из этой цепочки.
//        Пример: было а=10 стало а=15;  было е=30 стало е=10.
//        Примечание: присваивать “напрямую” значения нельзя, все манипуляции должны происходить за счёт переменных, а не их значений.
//        int a = 10;
//        int b = 15;
//        int c = 20;
//        int d = 25;
//        int e = 30;
//        int temp = a;
//
//        a = b;
//        b = c;
//        c = d;
//        d = e;
//        e = temp;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);

//Создать программу которая принимает на вход 3 вещественных числа,
//и будет выводить на экран ТО число, чей остаток от деления на 1.5
//-  меньше остальных. Для наглядности выводить и сам остаток.
//        double number = 3.5;
//        double number2 = 3.1;
//        double number3 = 9.9;
//
//        double reminderA = number % 1.5;
//        double reminderB = number2 % 1.5;
//        double reminderC = number3 % 1.5;
//
//        if (reminderA < reminderB && reminderA < reminderC) {
//            System.out.println(number);
//        } else if (reminderB < reminderA && reminderB < reminderC) {
//            System.out.println(number2);
//        } else {
//            System.out.println(number3);
//        }
//
//    }

//
//    double number1 = 15;
//    double number2 = 0;
//    char operation = '/';
//
//        if(operation =='*')
//
//    {
//        System.out.println(number1 * number2);
//
//    } else if(operation =='/')
//
//    {
//        if (number2 == 0) {
//            System.out.println("Error");
//        } else {
//            System.out.println(number1 / number2);
//        }
//
//    } else if(operation =='-')
//
//    {
//        System.out.println(number1 - number2);
//
//    } else if(operation =='+')
//
//    {
//        System.out.println(number1 + number2);
//    }


//        switch(operation)
//
//    {
//        case '*':
//            System.out.println(number1 * number2);
//            break;
//        case '/':
//            if (number2 == 0) {
//                System.out.println("Error");
//            } else {
//                System.out.println(number1 / number2);
//            }
//            break;
//
//        case '+':
//            System.out.println(number1 + number2);
//            break;
//        case '-':
//            System.out.println(number1 - number2);
//            break;
//        default:
//            System.out.println("Error");
//    }


//        //   В диапазоне от 0 до 100  вывести на экран первые 25 чётных чисел, исключая “десятки”.
//        int count = 0;
//        for (int i = 0; i <= 100; i++) {
//            if (count == 26) {
//                break;
//            }
//            if (i % 2 == 0 && i % 10 != 0) {
//                count++;
//                System.out.println(i);
//            }
//        }
//
//    }