package com.teachmeskills.lesson_4;

import java.util.Scanner;

/**
 * 0. Создать трехмерный массив из целых чисел
 * С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
 * Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
 */

public class Task_0 {
    public static void main(String[] args) {
        System.out.println("Start");

        int[][][] array = {{{11,12,13},{14,15,16}},
                            {{21,22,23},{24,25,26}},
                            {{31,32,33},{34,35,36}}};

        int i, j, t;
        System.out.println("Ваедите число:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

            for (i = 0; i < array.length; i++) {
                for (j = 0; j < array[i].length; j++) {
                    for (t = 0; t < array[i][j].length; t++) {
                        array[i][j][t] += num;
                        System.out.println(array[i][j][t] + "");
                    }
                }
            }
        System.out.println("End");
    }
}
