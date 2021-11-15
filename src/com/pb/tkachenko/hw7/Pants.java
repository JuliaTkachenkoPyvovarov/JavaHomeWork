package com.pb.tkachenko.hw7;

import java.awt.*;

public class Pants  extends Clothes implements ManClothes, WomenClothes{
    public Pants(String size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Штаны: " + size + ", " + color + ", " + price + ".");
    }

    @Override
    public void dressMan() {
        System.out.println("Штаны: " + size + ", " + color + ", " + price + ".");
    }
}
