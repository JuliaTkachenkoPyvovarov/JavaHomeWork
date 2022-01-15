package com.pb.tkachenko.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class FileNumbers {
    //createNumbersFile - создает текстовый файл ".txt" заполненный случайными целыми числами от 1 до 99.
    // 10 строк и по 10 чисел в каждой строке. Числа разделять пробелами.

    public static void createNumbersFile() throws IOException {
        Path path1 = Paths.get("numbers.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(path1)) {
            for (int i = 0; i < 10; i++) {
                    int[] arrInt = new int[10];
                    Random random = new Random();
                    for (int el = 0; el < 10; el++) {
                        arrInt[el] = random.nextInt(100);
                        if(arrInt[el] >= 10) writer.write(arrInt[el] + " ");
                        else writer.write("0"+arrInt[el] + " ");
                    }
                    writer.newLine();
                }

            //int[] array = new int[100];
            //for (int i = 0; array.length > i; i++) {
            //    array[i] = (int) (Math.random() * (100 - 1) + 1);
            //    writer.write(array[i] + " ");
            //    System.out.print(array[i] + " ");
            //    if ((i + 1) % 10 == 0) {
            //        writer.write("\n");
            //   }
            //    System.out.println();
            //}
            //writer.close();
        } catch (IOException io) {
            System.out.println("Ошибка записи: " + io);
        }
    }

//createOddNumbersFile - читает файл "numbers.txt", и создает на основе него новый файл "odd-numbers.txt"
// в который входят все числа из "numbers.txt" только все четные заменены на 0.

    public static void createOddNumbersFile() throws IOException {
        Path path21 = Paths.get("numbers.txt");
        Path path22 = Paths.get("odd-numbers.txt");
        // read from file
        try (BufferedReader reader = Files.newBufferedReader(path21);
             BufferedWriter writer = Files.newBufferedWriter(path22)) {
            String a;
            int q = 0;
            while ((a = reader.readLine()) != null) {
                System.out.println(a);
                String[] arr = a.split(" ");
                int[] intArr = new int[arr.length];
                for (int i = 0; i < arr.length; i++) {
                    int intVal = Integer.parseInt(arr[i]);
                    if (intVal % 2 == 0) {
                        intArr[i] = 0;
                        q++;
                    } else intArr[i] = intVal;
                    if (intArr[i] >= 10) writer.write(intArr[i] + " ");
                    else writer.write("0" + intArr[i] + " ");
                }
                writer.newLine();
            }
        } catch (Exception io) {
            System.out.println("Ошибка: " + io);
        }
        System.out.println("Файл записан!");
    };

    static void readPath(Path pathPath) {
        Path path = pathPath;
        System.out.println("Читаем файл \"" + path.toAbsolutePath() + "\":");
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String d;
            while ((d = reader.readLine()) != null) {
                System.out.println(d);
            }
        } catch (Exception ex) {
            System.out.println("Ошибка: " + ex);
        }
        System.out.println("Файл прочитан: " + pathPath.toString());
    };
}




        //try (Scanner scan = new Scanner(new File("D:\\Users\\dn110381tjv\\IdeaProjects\\JavaHomeWork\\src\\com\\pb\\tkachenko\\hw9\\numbers.txt"))) {
        //    FileWriter writter2 = new FileWriter("D:\\Users\\dn110381tjv\\IdeaProjects\\JavaHomeWork\\src\\com\\pb\\tkachenko\\hw9\\numbers.txt");
         //   while (scan.hasNext()) {
       //         Scanner str = new Scanner(scan.nextLine());
       //          while (str.hasNextInt()) {
          //          int c = str.nextInt();
            //        if (c % 2 != 0) {
              //          //System.out.println("0");
                //        writter2.write(c + " ");
                  //  } else {
                        //System.out.println(c + " ");
                    //    c = 0;
                      //  writter2.write(c + " ");
                    //}
          //      }
           // }
            //writter2.close();
           // System.out.println("Файл записан!");
     //   } catch (IOException io) {
       //     System.out.println("Файл не записан: " + io);
        //}

