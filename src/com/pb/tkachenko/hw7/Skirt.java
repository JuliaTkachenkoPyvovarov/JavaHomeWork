package com.pb.tkachenko.hw7;

import java.awt.*;

public class Skirt extends Clothes implements WomenClothes{
    public Skirt(String size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка: " + size + ", " + color + ", " + price + ".");
    }
}
