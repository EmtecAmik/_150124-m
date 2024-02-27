//package org.example._2024_02_26;
//
//
//
//
//// Дано трёхзначное число, вывести все цифры этого числа в виде строки.
////Пример: 345 – вывод: Число 345 -> 3, 4, 5.
//
//
//public class Less {
//    public static void main(String[] args) {// void это ничего, он ничего не вернет
//
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//
//
//        System.out.println(getNumbers(num));
//
//
//    }
//
//
//    public static String getNumbers(int number) {
//        int number1 = number / 100;
//        int number2 = (number - number1*100)/10;
//        int number3 = number % 10;
//        String result = "Число" +number + "->" + number1 + "," + number2 + "," + number3 + ".";
//        return result;
//    }
//
//
//}
