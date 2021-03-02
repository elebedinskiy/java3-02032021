package ru.elebedinskiy.java3;

import java.util.ArrayList;

public class Box <T extends Fruit> {

    /**
     * b. Класс Box в который можно складывать фрукты, коробки условно сортируются
     * по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     * c. Для хранения фруктов внутри коробки можете использовать ArrayList;
     */

    private ArrayList<T> fruits = new ArrayList<>();
    private int quantity;
    private float weight;

    public Box(){
        this.weight = 0.0f;
        this.quantity = 0;
    }

    public void add (T incomeFruits){
        this.fruits.add(incomeFruits);
    }

    public float getWeight(){
        for (int i = 0; i < fruits.size(); i++) {
            this.weight += fruits.get(i).getWeght();
        }
        return weight;
    }

    public int getQuantity() {
        for (int i = 0; i < fruits.size(); i++) {
            this.quantity += fruits.get(i).getQuantity();
        }
        return quantity;
    }
}
