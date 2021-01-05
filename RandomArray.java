package com.epam.trainings;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        Random rd = new Random(); //создаем новый рандомный объект
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(); //запись произвольного int в массиве
            System.out.println(array[i]);  //вывод на экран каждого элемента массива
        }
    }
}
