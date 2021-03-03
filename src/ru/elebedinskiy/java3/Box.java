package ru.elebedinskiy.java3;

import java.util.ArrayList;

public class Box <T extends Fruit> {

    private final ArrayList<T> fruits = new ArrayList<>(); // в коробке будут храниться фрукты в листе
    private int quantity;
    private float weight;

    public Box(){
        this.weight = 0.0f; // коробку создаем пустую, с нулевым весом
        this.quantity = 0; // без фруктов
    }

    // добавляем фрукты в коробку
    public void add (T incomeFruits){
        this.fruits.add(incomeFruits);
        this.quantity += incomeFruits.getQuantity();
        this.weight += incomeFruits.getWeght();
    }

    public float getWeight(){
        return weight;
    }

    public int getQuantity() {
        return quantity;
    }

    /*
    e. Внутри класса коробка сделать метод compare, который позволяет сравнить
    текущую коробку с той, которую подадут в compare в качестве параметра,
    true - если их веса равны, false в противном случае(коробки с яблоками
    мы можем сравнивать с коробками с апельсинами);
     */
    public boolean compare (Box compareBox){
        return Math.abs(this.getWeight() - compareBox.getWeight()) < 0.000001f;
    }
}
