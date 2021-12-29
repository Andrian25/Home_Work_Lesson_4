package com.teachmeskills.lesson_4;

/**
 * 4. Создайте двумерный массив.
 * Выведите на консоль диагонали массива.
 */

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Start");

        int[][] arry = {{15, 10, 18, 25},
                        {35, 40, 22, 12},
                        {51, 45, 23, 11},
                        {14, 52, 33, 27}};

        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry.length; j++) {
                if (i == j) {
                    System.out.print( arry[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("End");
    }
}
