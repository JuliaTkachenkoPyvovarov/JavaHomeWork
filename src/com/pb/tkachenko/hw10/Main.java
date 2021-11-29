package com.pb.tkachenko.hw10;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class Main {

    private static Object Integer;
    private static Object NumBox;
    private static Object Double;
    private static Object Float;

    public static void main(String args[]) {

        NumBox<Integer> integerNumBox = new NumBox<>(6);
        NumBox<Float>  FloatNumBox = new NumBox<>(5);

        try {
            integerNumBox.add(Integer, 7);
            integerNumBox.add(Integer, 8);
            integerNumBox.add(Integer, 1);
            integerNumBox.add(Integer, 3);
            integerNumBox.add(Integer, 5);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        integerNumBox.get(0); //
        integerNumBox.lenght(); //
        integerNumBox.average();
        integerNumBox.sum();
        integerNumBox.max();

        try {
            FloatNumBox.add(Float, (float) 11.7);
            FloatNumBox.add(Double, (float) 5.8);
            FloatNumBox.add(Double, (float) 0.98);
            FloatNumBox.add(Double, (float) 6.3);
            FloatNumBox.add(Double, (float) 1.2098);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        FloatNumBox.get(0); //
        FloatNumBox.lenght(); //
        FloatNumBox.average();
        FloatNumBox.sum();
        FloatNumBox.max();


        //Создать класс Main с методом main где протестировать полученный класс на примере NumBox<Float> и NumBox<Integer>.
    }

}