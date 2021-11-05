package com.pb.tkachenko.hw6;

public class Animal {
    private String name;
    private String food;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getFood(){
        return food;
    };

    public void setFood(String food){
        this.food = food;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void makeNoise(){
        System.out.println(name + "издает голос: лает, мяукает, ржет.");
    }

    public void eat(){
        System.out.println(name + " кушает.");
    }

    public void sleep(){
        System.out.println(name + " спит.");
    }
}




//В классах Dog, Cat, Horse переопределить методы toString, equals, hashCode.

//В цикле отправляйте животных на прием к ветеринару.
//Объект класса Veterinarian создайте с помощью рефлексии.