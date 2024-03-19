package org.example._HW7;

import java.util.Random;

public class Numbers {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[100];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(201) - 100;
        }


        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }


        double positivePercentage = (double) positiveCount / numbers.length * 100;
        double negativePercentage = (double) negativeCount / numbers.length * 100;
        double zeroPercentage = (double) zeroCount / numbers.length * 100;
        double evenPercentage = (double) evenCount / numbers.length * 100;
        double oddPercentage = (double) oddCount / numbers.length * 100;


        System.out.println("Процент положительных чисел: " + positivePercentage + "%");
        System.out.println("Процент отрицательных чисел: " + negativePercentage + "%");
        System.out.println("Процент нулей: " + zeroPercentage + "%");
        System.out.println("Процент чётных чисел: " + evenPercentage + "%");
        System.out.println("Процент нечётных чисел: " + oddPercentage + "%");
    }

}
