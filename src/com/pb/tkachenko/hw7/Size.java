package com.pb.tkachenko.hw7;

public enum Size {
    XXS("very very small","XXS"), //32
    XS("very small","XS"), //34
    S("small", "S"), //36
    M("medium", "M"), //38
    L("large", "L"); //40

    // Создать конструктор принимающий на вход description и euroSize.
    Size(String description, String euroSize) {
    }

    // метод getEuroSize()возвращающий числовое значение (32, 34, 36, 38, 40) соответствующее каждому размеру.
    void getEuroSize(String euroSize) {
        if (euroSize == "32"){
            System.out.println("Размер XXS соответствует размеру "+ euroSize);
        }
        if (euroSize == "34"){
            System.out.println("Размер XS соответствует размеру "+ euroSize);
        }
        if (euroSize == "36"){
            System.out.println("Размер S соответствует размеру "+ euroSize);
        }
        if (euroSize == "38"){
            System.out.println("Размер M соответствует размеру "+ euroSize);
        }
        if (euroSize == "40"){
            System.out.println("Размер L соответствует размеру "+ euroSize);
        }
    }

    // метод getDescription(), возвращающий строку для XXS "Детский размер", для остальных "Взрослый размер"
    void getDescription(String euroSize){
        if(euroSize == "XXS") {
            System.out.println(euroSize + " - детский размер");
        } System.out.println(euroSize + " - взрослый размер");
    }
}
