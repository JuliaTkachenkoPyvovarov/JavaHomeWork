package com.pb.tkachenko.hw6;

import java.util.Objects;

public class Horse extends Animal {
    String breed; //порода Мустанг, Орловский рысак, Пони
    String exterior; // упряжная, верховая, вьючная ...

    public Horse(String breed, String exterior) {
        this.breed = breed;

    }

    @Override
    public void makeNoise(){
        System.out.println(getName() + " ржет.");
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println(getName() + " жует сено.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
            Horse horse = (Horse) o;
        return Objects.equals(exterior, horse.exterior) && Objects.equals(breed, horse.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exterior, breed);
    }

    @Override
    public String toString() {
            return "Horse{" +
                    "exterior='" + exterior + '\'' +
                    ", breed=" + breed +
                    '}';
        }

}
