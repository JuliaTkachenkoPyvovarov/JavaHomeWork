package com.pb.tkachenko.hw7;

import com.sun.prism.paint.Color;

public class Atelier {
        public static void main(String[] args) {
        Pants pants = new Pants("XXS",35,"синий");
        Tshirt tshirt = new Tshirt("L",78,"белый");
        Skirt skirt = new Skirt("M", 79,"фиолетовый");
        Tie tie = new Tie("XS",63,"зеленый");

        //В методе main создать массив, содержащий все типы одежды
        Clothes[] clothes = new Clothes[]{pants, skirt, tie, tshirt};

        //и вызвать методы dressMan и dressWomen передав туда этот массив
        dressMan(clothes);
        dressWomen(clothes);
    }

    public static void dressMan(Clothes[] clothes) {
        System.out.println("Одеваем мужчину: ");
        for (Clothes clothes1 : clothes) {
            if (clothes1 instanceof Pants) {
                ((Pants) clothes1).dressMan();
            } else if (clothes1 instanceof Tshirt) {
                ((Tshirt) clothes1).dressMan();
            } else if (clothes1 instanceof Tie) {
                ((Tie) clothes1).dressMan();
            }
        }

    }

    public static void dressWomen(Clothes[] clothes) {
        System.out.println("Одеваем женщину: ");
        for (Clothes clothes1 : clothes) {
            if (clothes1 instanceof Pants) {
                ((Pants) clothes1).dressWomen();
            } else if (clothes1 instanceof Tshirt) {
                ((Tshirt) clothes1).dressWomen();
            } else if (clothes1 instanceof Skirt) {
                ((Skirt) clothes1).dressWomen();
            }
        }
    }
}


