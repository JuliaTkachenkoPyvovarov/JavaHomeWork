package com.pb.tkachenko.hw10;

public class NumBox <T extends Number> {

    //- массив из объектов класса T, инициализировать массив в конструкторе.
    public T[] nums;

    public NumBox(T[] nums) {
        this.nums = nums;
    }

    //конструктор принимающий параметр - максимальную длину массива
    public NumBox(int maxsize) {
        nums = (T[]) new Number[maxsize];
        System.out.println("Максимальная длина массива = " + maxsize);
    }

    //метод T get(int index) возвращающий число по индексу
    public T get(int index){
        System.out.println((index+1) + "елемент массива - "+ nums[index]);
        return nums[index];
    }

    //метод void add(T num) добавляющий число в массив. В случае если массив полон - выбросить исключение.
    public void add(T num) throws Exception {
        int a;
        nums.add(a);
        if () {
            System.out.println("");
        }else {
            exs}
        }

    //метод int length() возвращает текущее количество элементов
    public int lenght(){
        System.out.println("В массиве "+ nums.length+ " елементов.");
        return nums.length;
    };

    //метод double average() - подсчет среднего арифметического среди элементов массива
    public double average(){
        int i = 0;
        int a = (int) nums[i];
        if (i< nums.length) {
            a = a + a;
            a++;
        } else {
            a =  a / nums.length;
        System.out.println("Среднее арифметическое = " + a);
        }
        return a;
    };

    //метод double sum() - сумма всех элементов массива.
    public double sum(){
        int i = 0;
        int a = (int) nums[i];
        if (i< nums.length) {
            a = a + a;
            a++;
        } System.out.println("Сумма всех элементов массива = " + a);
        return a;
    }

    //метод T max() - максимальный элемент массива.
    public T max(){
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        //max - максимальное значение

        return ;
    }




}




//При подсчете воспользоваться тем, что у любого из объектов подклассов Number есть методы intValue, doubleValue, floatValue и другие.
//
//
//Создать класс Main с методом main где протестировать полученный класс на примере NumBox<Float> и NumBox<Integer>.