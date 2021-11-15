package com.pb.tkachenko.hw7;

import java.awt.*;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {
    public Tshirt(String size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Футболка: " + size + ", " + color + ", " + price + ".");
    }

    @Override
    public void dressWomen() {
        System.out.println("Футболка: " + size + ", " + color + ", " + price + ".");
    }
}
