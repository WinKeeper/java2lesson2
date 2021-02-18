package ru.geekbrains.nikitag.java2.lesson2;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {

        String[][] rightArr = {
                {"1", "2", "3", "4"},
                {"6", "7", "4", "9"},
                {"11", "12", "13", "14"},
                {"16", "17", "18", "19"}
        };


        String[][] wrongSizeArr = {
                {"1", "2", "3", "4"},
                {"6", "7", "4", "9"},
                {"11", "12", "13", "14", "15"},
                {"16", "17", "18", "19", "20"}
        };

        String[][] wrongFormatArr = {
                {"1", "ASDASDASD", "3", "4"},
                {"6", "7", "4", "9"},
                {"11", "12", "13", "14"},
                {"16", "17", "18", "19"}
        };

        //Передаём верный массив
        arrSumm(rightArr);
        //Массив с неправильным размером
        arrSumm(wrongSizeArr);
        //Массив с некоректными данными
        arrSumm(wrongFormatArr);
    }

    public static void arrException(String[][] arr) {
        if (arr.length == 4) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i].length != 4) {
                        throw new MyArraySizeException();
                    }
                }
            }
        }
        System.out.println("Массив верного размера!");
    }

    public static void arrToIntegerException(String[][] arr) {
        int arrSumm = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    arrSumm = arrSumm + Integer.parseInt(arr[i][j]);
                } catch (MyArrayDataException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Сумма всех чисел массива = " + arrSumm);
    }

    public static void arrSumm(String[][] arr) {
        int arrSumm = 0;
        if (arr.length == 4) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i].length != 4) {
                        throw new MyArraySizeException();
                    }
                    try {
                        arrSumm = arrSumm + Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
        }
        System.out.println("Сумма всех чисел массива = " + arrSumm);
    }
}

