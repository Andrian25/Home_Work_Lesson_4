package com.teachmeskills.lesson_4;

/**
 * 3. Создайте двумерный массив целых чисел.
 * Выведите на консоль сумму всех элементов массива.
 */

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Start");

        int[][] array = {{5,8,4,12},{1,10,2,15},{18,3,7,6},{15,4,13,4}};
        int summ = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                summ += array[i][j];
            }
            System.out.println();
        }
        System.out.println("Общая сумма массива :" + summ);
        System.out.println("End");
    }
}