package org.example._HW4;

import java.util.Scanner;

public class MergeWords {
    public static void main(String[] args ) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое слово");
        String word1 = scanner.nextLine();


        System.out.println("Введите второе слово:");
        String word2 = scanner.nextLine();


        if (word1.length() % 2 != 0 || word2.length() % 2 != 0) {
            System.out.println("Ошибка");
            return;
        }


        char[] halfWord1 = word1.substring(0, word1.length() / 2).toCharArray();
        char[] halfWord2 = word2.substring(word2.length() / 2).toCharArray();


        char[] mergedCharArray = new char[halfWord1.length + halfWord2.length];


        System.arraycopy(halfWord1, 0, mergedCharArray, 0, halfWord1.length);


        System.arraycopy(halfWord2, 0, mergedCharArray, halfWord1.length, halfWord2.length);


        String mergedWord = new String(mergedCharArray);


        System.out.println("Результат слияния: " + mergedWord);



    }




}
