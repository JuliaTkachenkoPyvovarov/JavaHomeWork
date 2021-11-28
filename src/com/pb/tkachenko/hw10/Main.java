package com.pb.tkachenko.hw10;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class Main {

    public static void main(String args[]) {
        // Создание массивов типа Integer, Double
        int[] intArr = { 1, 2, 3, 4, 5 };
        double[] doubleArr = { 1.1, 2.2, 3.3, 4.4 };

        System.out.println("Массив intAr содержит: ");
        printArray(intArr);   // передать массив Integer

        System.out.println("\nМассив doubleAr содержит:");
        printArray(doubleArr);   // передать массив Double



    }

    private static void printArray(int[] intArr) {
    }


}
}
