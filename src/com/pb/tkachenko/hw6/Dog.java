package com.pb.tkachenko.hw6;

import java.util.Objects;

public class Dog extends Animal {
    public String group; //    Сторожевые , декоративные, охотничьи, пастушьи....
    public int weight; // масса/вес собаки

    public Dog(String group, int weight) {
        this.group = group;
        this.weight = weight;
    }


    @Override //переопределяем метод из родительского классса
    public void makeNoise(){
        System.out.println(getName() + " лает.");
    }

    @Override //переопределяем метод из родительского класса с сохранением инфо из род класса + добавляем новое
    public void eat() {
        super.eat();
        System.out.println(getName() + " ест мясо.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return weight == dog.weight && Objects.equals(group, dog.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, group);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "group='" + group + '\'' +
                ", weight=" + weight +
                '}';
    }
}
