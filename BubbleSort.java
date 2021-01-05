package com.epam.trainings;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arrayRandom = {70, 79, 52, 74, 62, 15, 2, 37, 58, 61, 34, 57, 61, 33};
        bubbleSort(arrayRandom);
    }
    static void bubbleSort(int[] array) {
        int comparisonsDone = 0;
        int swapsDone = 0;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                printArray(array);
                if (array[i] > array[i+1]) {
                    System.out.println("Swap " + array[i] + " and " + array[i+1]);
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapsDone++;
                    sorted = false;
                } else {
                    System.out.println("No need to change elements " + i + " and " + (i+1));
                }
                comparisonsDone++;
            }
        }
        System.out.println("Array size = " + array.length);
        System.out.println("Comparisons done = " + comparisonsDone);
        System.out.println("Swaps done = " + swapsDone);
    }

    static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j);
            System.out.print(" ");
        }
        System.out.println();
    }
}
