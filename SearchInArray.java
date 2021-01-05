package com.epam.trainings;

public class SearchInArray {
    public static void main (String[] args){
        int[] arraySmall={22, 58, 74, 21, 51, 62, 85, 1, 54, 34};
        printMaximumElement(arraySmall);
    }

    static void printMaximumElement(int[] array) {
        int max = array[0];
        int maxIndex = 0;
        int comparisons = 0;
        int replacements = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
                maxIndex = i;
                replacements++;
            }
            comparisons++;
        }
        System.out.println("Max element: " + max);
        System.out.println("Max element index: " + maxIndex);
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Replacements: " + replacements);
    }
}
