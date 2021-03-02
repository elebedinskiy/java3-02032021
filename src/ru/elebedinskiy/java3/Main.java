package ru.elebedinskiy.java3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task #1");
        Integer[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        swap(nums1, 2, 9);
        System.out.println(Arrays.toString(nums1) + "\n");

        System.out.println("Task #2");
        Integer[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(arrayToList(nums2) + "\n");
    }

    // 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    public static void swap (Object[] array, int i, int j){
        Object buffer = array[i];
        array[i] = array[j];
        array[j] = buffer;
    }

    // 2. Написать метод, который преобразует массив в ArrayList;
    public static <T> ArrayList<T> arrayToList (T[] inputArray){
        return new ArrayList<T>(Arrays.asList(inputArray));
    }
}
