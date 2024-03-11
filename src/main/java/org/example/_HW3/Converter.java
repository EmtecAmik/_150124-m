package org.example._HW3;


//Создайте класс Converter - конвертер системы счисления.
//У пользователя спрашивается число системы счисления, (используйте Scanner)
//Запрашивается само число (ожидается корректный ввод)
//У пользователя спрашивается число системы счисления в какую перевести
//Конвертация должна быть с помощью класса обертки Long.

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите число");
        String number = scanner.next();

        System.out.println("Введите текущую систему счисления (2, 8, 10, 16): ");
        int source = scanner.nextInt();

        if (source!= 2 && source!= 8 && source!= 10 && source!= 16) {
            System.out.println("Ошибка");
            return;


        }


        System.out.print("Введите в какую систему счисления переводим (2, 8, 10, 16): ");
        int target = scanner.nextInt();


        if (target!= 2 && target!= 8 && target!= 10 && target!= 16) {
            System.out.println("Ошибка");
            return;

        }


        long numberRes = Long.parseLong(number, source);
        String result = Long.toString(numberRes, target);
        System.out.println("Ваш результат: " + result);

    }
}
