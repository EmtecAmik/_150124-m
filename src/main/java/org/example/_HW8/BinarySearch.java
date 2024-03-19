package org.example._HW8;

public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 13;
        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.println("Элемент " + target + " найден в массиве по индексу " + index);
        } else {
            System.out.println("Элемент " + target + " не найден в массиве.");
        }
    }


}
