package com.pb.tkachenko.hw10;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class Main {

    private static Object Integer;

    public static void main(String args[]) {

        NumBox<Integer> integerNumBox = new NumBox<>(6);

        int q = 8;
        int w = 0;
        int e = 7;
        int r = 2;
        int t = 4;

        //System.out.println("Массив Integer содержит: " + printArray(NumBox< java.lang.Integer >));

        integerNumBox.get(2); // null ?

        try {
            integerNumBox.add(Integer, 7);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        integerNumBox.lenght(); //6
        integerNumBox.average();
        integerNumBox.sum();
        integerNumBox.max();


        //System.out.println("\nМассив doubleAr содержит:");
        //printArray(doubleArr);   // передать массив Double

    }

    private static void printArray(int[] intArr) {
    }
}