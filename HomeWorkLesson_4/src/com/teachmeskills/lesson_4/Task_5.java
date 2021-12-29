package com.teachmeskills.lesson_4;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 5. Создайте двумерный массив целых чисел.
 * Отсортируйте элементы в строках двумерного массива по возрастанию.
 */

public class Task_5 {
    public static void main(String[] args) {
        System.out.println("Start");

        int[][] rary = new int[4][4];

        System.out.println("Array");
        for (int i = 0; i < rary.length; i++) {
            for (int j = 0; j < rary[i].length; j++) {
                rary[i][j] = (int) (Math.random() * 10);
                System.out.print(rary[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Array after sort");
        for (int i =0; i < rary.length; i++){
           Arrays.sort(rary[i]);
           Arrays.sort(rary[i]);
            System.out.println(Arrays.toString(rary[i]));
        }
        System.out.println("End");
    }
}