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

        System.out.println("Task #3");

        // проверили, что коробки только для фруктов
        // Box<Integer> integerBox1 = new Box<Integer>(2);

        // создали две коробки
        Box<Apple> boxApple1 = new Box<Apple>();
        Box<Orange> boxOrange1 = new Box<Orange>();
        Box<Apple> boxApple2 = new Box<Apple>();
        Box<Orange> boxOrange2 = new Box<Orange>();

        // положили в коробки фрукты несколько раз для
        boxApple1.add(new Apple(1));
        boxOrange1.add(new Orange(1));
        boxApple1.add(new Apple(9));
        boxOrange1.add(new Orange(9));
        boxApple1.add(new Apple(2));
        boxOrange1.add(new Orange(2));

        boxApple2.add(new Apple(12));
        boxOrange2.add(new Orange(10));

        System.out.println("Коробка в яблоками | вес: " + boxApple1.getWeight() + ", кол-во: " + boxApple1.getQuantity());
        System.out.println("Коробка в апельсинами | вес: " + boxOrange1.getWeight() + ", кол-во: " + boxOrange1.getQuantity());

        System.out.println(boxApple1.compare(boxApple2)); // true
        System.out.println(boxOrange1.compare(boxOrange2)); // false
        // ...
        System.out.println("\n");
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
