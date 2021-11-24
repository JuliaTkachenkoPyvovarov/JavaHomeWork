package com.pb.tkachenko.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileNumbers {
    //createNumbersFile - создает текстовый файл ".txt" заполненный случайными целыми числами от 1 до 99.
    // 10 строк и по 10 чисел в каждой строке. Числа разделять пробелами.

    public static void createNumbersFile() throws IOException {
        try {
            Writer writer = new FileWriter("D:\\Users\\dn110381tjv\\IdeaProjects\\JavaHomeWork\\src\\com\\pb\\tkachenko\\hw9\\numbers.txt");
            int[] array = new int[100];
            for (int i = 0; array.length > i; i++) {
                array[i] = (int) (Math.random() * (100 - 1) + 1);
                System.out.println();
                writer.write(array[i] + " ");
                System.out.print(array[i] + " ");
                if ((i + 1) % 10 == 0) {
                    writer.write("\n");
                }
            }
            writer.close();

        } catch (IOException io) {
            System.out.println(io);
        }
    }

//createOddNumbersFile - читает файл "numbers.txt", и создает на основе него новый файл "odd-numbers.txt"
// в который входят все числа из "numbers.txt" только все четные заменены на 0.

    public static void createOddNumbersFile() throws IOException {
        Path path1 = Paths.get("D:\\Users\\dn110381tjv\\IdeaProjects\\JavaHomeWork\\src\\com\\pb\\tkachenko\\hw9\\numbers.txt");
        // read from file
        try (BufferedReader reader = Files.newBufferedReader(path1)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException io) {
            System.out.println("Ошибка чтения файла: " + io);
        }
        System.out.println("Файл прочитан!");

        // write to file
        Path path2 = Paths.get("D:\\Users\\dn110381tjv\\IdeaProjects\\JavaHomeWork\\src\\com\\pb\\tkachenko\\hw9\\numbers.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path2)) {
            //int c = str.nextInt();
           // if (c % 2 != 0) {
                //System.out.println("0");
               // writter2.write(c + " ");
           // } else {
                //System.out.println(c + " ");
              //  c = 0;
             //   writter2.write(c + " ");
            }
         //   writer.write("Some test 123");
       //     writer.newLine();
     //       writer.write("Other string 456");
      //  } catch (Exception ex) {
        //    System.out.println("Error with file write: " + ex);
        }
        //System.out.println("Write to file \"" + path.toAbsolutePath() + "\" done!");
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

