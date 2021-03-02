package ru.elebedinskiy.java3;

public class Fruit {

    private int quantity;
    private float weght;

    Fruit(int quantity, float weghtOne){
        this.quantity = quantity;
        this.weght = weghtOne * quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getWeght() {
        return weght;
    }
}
