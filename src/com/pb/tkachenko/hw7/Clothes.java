package com.pb.tkachenko.hw7;

import java.awt.*;

public abstract class Clothes {
    public String size;
    public String color ;
    public int price;

    public Clothes(String size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }
}
