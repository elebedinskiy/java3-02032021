package ru.elebedinskiy.java3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task #1");
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        swap(nums, 2, 9);
        System.out.println(Arrays.toString(nums) + "\n");
    }

    // 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    public static void swap (Object[] array, int i, int j){
        Object buffer = array[i];
        array[i] = array[j];
        array[j] = buffer;
    }
}
