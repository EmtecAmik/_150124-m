package org.example._HW3;

public class Kcal {

    public static void main(String[] args) {

        int diameter24 = 24;
        int diameter28 = 28;

        double area24 = Math.PI * Math.pow(diameter24 / 2.0, 2);
        double area28 = Math.PI * Math.pow(diameter28 / 2.0, 2);

        double extraArea = area28 - area24;

        int caloriesPerSquareCentimeter = 40;
        double extraCalories = extraArea * caloriesPerSquareCentimeter;

        System.out.println("Количество лишних калорий: " + extraCalories);
    }


}
