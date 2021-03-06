package Lesson2;

import java.util.Arrays;

public class HW2 {
    public static void main(String[] args) {
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0

        int[] row = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        task1(row);
        System.out.println("1." + Arrays.toString(row));

        //2. Задать пустой целочисленный массив размером 8.
        // Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22
        int[] row2 = new int[8];
        task2(row2);
        System.out.println("2." + Arrays.toString(row2));

        //3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
        // написать метод,принимающий на вход массив и умножающий числа меньше 6 на 2
        int[] row3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        task3(row3);
        System.out.println("3." + Arrays.toString(row3));

        //4. Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента.
        int[] row4 = {2, 101, -6, 6, 2, 44, 1, 32, 90};
        System.out.println("4 - min. " + task4min(row4));
        System.out.println("4 - max. " + task4max(row4));

        //5. Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
        // заполнить его диагональные элементы единицами, используя цикл(ы)
        int[][] row5 = new int[5][5];
        task5(row5);
        for (int i = 0; i < row5.length; i++) {
            for (int j = 0; j < row5[i].length; j++) {
                System.out.print(row5[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void task1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
    }

    private static void task2(int[] array) {
        int j = -2;
        for (int i = 0; i < array.length; i++) {
            array[i] = j;
            array[i] = j += 3;
        }
    }

    private static void task3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] *= 2;
        }
    }

    private static int task4min(int[] array) {
        int first = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < first)
                first = array[i];
        }
        return first;
    }

    private static int task4max(int[] array) {
        int last = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > last)
                last = array[i];
        }
        return last;
    }

    private static void task5(int[][] array) {
        for (int i = 0; i < array.length; i++) {
                array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
            }

        }
    }







