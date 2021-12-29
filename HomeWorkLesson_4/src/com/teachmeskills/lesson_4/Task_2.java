package com.teachmeskills.lesson_4;

import java.util.Arrays;

/**
 * 2. Умножение двух матриц  Создайте два массива целых чисел размером 3х3 (две матрицы).
 * Напишите программу для умножения двух матриц.  первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * втрой массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}  Ожидаемый результат:  1  2  3   1  1  1   0  0  0
 */

public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Start");

        int[][] arry1 = {{1, 0, 0, 0},{0, 1, 0, 0},{0, 0, 0, 0}};
        int[][] arry2 = {{1, 2, 3},{1, 1, 1},{0, 0, 0},{2, 1, 0}};
        int rar = arry1.length;
        int tac = arry2[0].length;
        int[][] arry3 = new int[rar][tac];
        int result = 0;

        for (int i = 0; i < rar; i++) {
            for (int j = 0; j < tac; j++) {
                for (int k = 0; k < arry1[0].length; k++ ) {
                    result += arry1[i][k]*arry2[k][j];
                }
                arry3[i][j] = result;
                result = 0;
                System.out.print(arry3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("End");
    }
}