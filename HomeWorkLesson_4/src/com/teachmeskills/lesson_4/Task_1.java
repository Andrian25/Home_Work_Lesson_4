package com.teachmeskills.lesson_4;

import java.util.Arrays;

/**
 *	1. Шахматная доска  Создать программу для расскаски шахматной доски с помощю цикла.
 * Создать двумерный массив String'ов 8х8.   С помощью циклов задать элементам циклам значения B(Black) или W(White).
 * Результат работы программы:   W  B  W  B  W  B  W  B
 *                               B  W  B  W  B  W  B  W
 *
 */

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Start");

        String [][] array = new String[8][8];
        int vplab = 0;

        for (int i = 0; i < array.length; i++) {
            for (int p = 0; p < array.length; p++) {
                if (vplab == 0) {
                    array[i][p] = "W";
                    vplab = 1;
                } else {
                    array[i][p] = "B";
                    vplab = 0;
                }
            } if (vplab == 0) {
                vplab = 1;
            } else {
                vplab = 0;
            }
            System.out.println();
            System.out.print(Arrays.toString(array[i]));
        }
        System.out.println();
        System.out.println("End");
    }
}