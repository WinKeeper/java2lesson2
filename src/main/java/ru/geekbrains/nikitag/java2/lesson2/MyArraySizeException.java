package ru.geekbrains.nikitag.java2.lesson2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {

    public MyArraySizeException() {
        super("Размер массива должен быть формата 4 на 4");
    }

}
