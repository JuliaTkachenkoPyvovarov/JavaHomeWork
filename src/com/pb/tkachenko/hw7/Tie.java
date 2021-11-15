package com.pb.tkachenko.hw7;

import java.awt.*;

public class Tie extends Clothes implements ManClothes {
    public Tie(String size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan () {
        System.out.println("Галстук: " + size + ", " + color + ", " + price + ".");
    }

}
