package com.pb.tkachenko.hw6;

import java.util.Objects;

public class Cat extends Animal {
    private String catFur; //длина шерсти
    private String color; //окрас

    public Cat(String catFur, String color) {
        this.catFur = catFur;
        this.color = color;
    }


    @Override
    public void makeNoise(){
        System.out.println(getName() + " мяукает.");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(getName() + " лакает молоко.");


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(catFur, cat.catFur ) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catFur, color);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catFur='" + catFur + '\'' +
                ", color=" + color +
                '}';
    }

}
