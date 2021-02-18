package ru.geekbrains.nikitag.java2.lesson2;

import java.io.IOException;

public class MyArrayDataException extends NumberFormatException {

    public MyArrayDataException (int indexY, int indexX) {
        super("В массиве элемента некоректные данные: i = " + indexY + ", j = "+ indexX);
    }

}
