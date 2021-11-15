package com.pb.tkachenko.hw6;

//import java.lang.reflect.Constructor;
//import java.util.Arrays;

public class VetСlinic {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog("сторожевые", 7);
        Dog dog1 = new Dog("охотничьи", 12);
        Dog dog2 = new Dog("декоративные", 5);
        Dog dog3 = new Dog("охотничьи", 12);
        dog.setName("Собака");
        dog.setFood(" мясом");
        dog.setLocation(" в будке.");

        Cat cat = new Cat("длинная", "серая");
        Cat cat1 = new Cat("короткая", "белая");
        cat.setName("Кошка");
        cat.setFood(" молоком");
        cat.setLocation(" в доме или квартире.");

        Horse horse = new Horse("Мустанг", "верховая");
        Horse horse1 = new Horse("Мустанг", "верховая");
        horse.setName("Лошадь");
        horse.setFood(" сеном");
        horse.setLocation(" в стойле.");

        Animal[] animals = new Animal[] {dog, cat, horse};

        Veterinarian veterinarian = new Veterinarian("Лошадь");

        //dog.makeNoise();
        //dog.eat();
        //cat.makeNoise();
        //cat.eat();
        //horse.makeNoise();
        //horse.eat();


        //итоговая попітка создания объекта через рефлексию - не получилось
        //Class Veterinar = Class.forName("com.pb.tkachenko.hw6.Veterinarian");
        //Veterinarian veter = Veterinar.getConstructor(new Class[] {String.class});
        //Object obj = veter.newInstance("Собака");
        //if (obj instanceof Veterinarian) {
        //((Veterinarian) obj).treatAnimal(dog);
        //Object object = com.pb.tkachenko.hw6.Veterinarian.newInstance();
        //}


        //System.out.println("сравнение 1 и 2: " + dog1 + "и" + dog2 + " " + dog1.equals(dog2));
        //System.out.println("сравнение 1 и 3: " + dog1 + "и" + dog3 + " " + dog1.equals(dog3));
        //System.out.println("сравнение 1 и 2: " + cat1 + "и" + cat1 + " " + cat.equals(cat1));
        //System.out.println("сравнение 1 и 3: " + horse + "и" + horse1 + " " + horse.equals(horse1));
        //System.out.println("hashCode 1: " + dog1.hashCode());
        //System.out.println("hashCode 2: " + dog2.hashCode());
        //System.out.println("hashCode 3: " + dog3.hashCode());

        for (Animal a: animals) {
            Veterinarian.treatAnimal(a);
        }
    }
};

