package com.andrii.oop.lesson1;

public class TestExample {
    public static void main(String[] args) {
        int value = 10;
        int[] values = {value, 100, 199, 250};
        printArray(values);
    }

    private static void printArray(int[] values) {
        for (int value : values) {
            System.out.println(value);
        }
    }
}