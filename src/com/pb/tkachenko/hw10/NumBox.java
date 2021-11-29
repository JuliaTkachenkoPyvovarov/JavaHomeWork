package com.pb.tkachenko.hw10;

public class NumBox <T extends Number> {

    //- массив из объектов класса T, инициализировать массив в конструкторе.
    public T[] nums;
    //nums = (T[]) new nums);

    public NumBox(T[] nums) {
        this.nums = nums;
    }
    //конструктор принимающий параметр - максимальную длину массива +
    public NumBox(int maxsize) {
        nums = (T[]) new Number[maxsize];
        System.out.println("Максимальная длина массива = " + maxsize);
    }

    //метод T get(int index) возвращающий число по индексу
    public T get(int index){
        System.out.println(index + " елемент массива - "+ nums[index]);
        return nums[index];
    }

    //метод void add(T num) добавляющий число в массив. В случае если массив полон - выбросить исключение.
    public void add(Object integer, T num) throws Exception {
        int i = 0;
        int count = 0;
        for(T a : nums) {
            if (a != null) {
                count++;
                System.out.println("Элемент " + a + " добавлен в массив");
            } else count += 0;
        }
        if (nums.length < count) {
            System.out.println("Ошибка. Нет места в массиве!");
            Exception ex = new Exception();
            throw ex;
        }else {
            this.nums[i] = num;
            i++;
        }
        }

    //метод int length() возвращает текущее количество элементов
    public int lenght(){
        int count = 0;
        for(T i : nums){
            if(!(i == null)){
                count++;
            } else count+=0;
        }
        System.out.println("В массиве "+ count + " елементов.");
        return count;
    }


    //метод double average() - подсчет среднего арифметического среди элементов массива
    public double average(){
        int i = 0;
        int a = (int) nums[i].intValue();
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
        double sum1 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum1 = (sum1 + nums[i].doubleValue());


        //int i = 0;
       // int a = (int) nums[i].intValue();
       // if (i< nums.length) {
        //    a = a + a;
        //    a++;
        } System.out.println("Сумма всех элементов массива = " + sum1);
        return sum1;
    }

    //метод T max() - максимальный элемент массива.
    public int max(){
        int max1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (get(max1).intValue() < get(i).intValue()) {
                max1 = i;      //временное значение, для замены местами
            }
        }

          // почему выдает исключение: NullPointerException ???
        //for (int i = 0; i < nums.length; i++) {
         //   if (nums[i].intValue() > max) {
        //        max = nums[i].intValue();
        //    }

        return max1;
    }

}




//При подсчете воспользоваться тем, что у любого из объектов подклассов Number есть методы intValue, doubleValue, floatValue и другие.
//
//
//Создать класс Main с методом main где протестировать полученный класс на примере NumBox<Float> и NumBox<Integer>.