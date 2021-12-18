package com.pb.tkachenko.hw11_2;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

import static sun.nio.ch.IOUtil.load;

public class TelefonMain {

    private static Object String;

    public static void main(String[] args) throws Exception {

        //
        List<String> tel = Arrays.asList("0677029726", "0677654321", "09956423", "098765431");
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Ткаченко Юлия Васильевна", "11.03.1981", "Днепр", "0677029726", LocalDateTime.of(1998, 03, 11)));
        contacts.add(new Contact("Иванов Иван Иванович", "14.03.2003" , "Киев", "0677654321", LocalDateTime.of(1997, 03, 14)));
        contacts.add(new Contact("Петров Петр Петрович", "11.12.2017", "Запорожье", "09956423, 098765431", LocalDateTime.of(1995, 12,11)));

        //добавление элемента
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String newFIO = scan.nextLine();
        System.out.print("Введите адрес: ");
        String newAdres = scan.nextLine();
        System.out.print("Введите дату рождения: ");
        String newBDate = scan.nextLine();
        System.out.print("Введите телефон: ");
        String newTel = scan.nextLine();

        Contact newContact = new Contact(newFIO, newBDate, newAdres, newTel);
        contacts.add(newContact);

        //удаление элемента: принимает телефон
        System.out.println("Введите телефон для удаления контакта: ");
        String delTel = scan.nextLine();
        tel.remove(tel);
        System.out.println("Удалено.");

        //поиск элементов
        System.out.println("Введите телефон для поиска контактов: ");
        String findTel = scan.nextLine();
        Contact result = contacts.get(tel);
        if (result != null) {
            System.out.println("Поиск по номеру телефона: телефон " + findTel + " принадлежит " + result.FIO);
        } else
            System.out.println("Такого номера нет в телефонной книге.");


        //вывод всех записей с сортировкой по указанному полю (можно ограничиться двумя на выбор)
        // Сортировка по FIO
        System.out.println("Вывод всех контактов с сортировкой по ФИО. ");
        //Comparator<Message> comparator = Comparator.comparing(obj -> obj.getId());
        contacts.sort(Comparator.comparing(obj -> obj.FIO));
        System.out.println("Сортировка по ФИО:" + contacts);

        // Сортировка по adres
        System.out.println("Вывод всех контактов с сортировкой по адресу. ");
        contacts.sort(Comparator.comparing(obj -> obj.adres));
        System.out.println("Сортировка по адресу:" + contacts);

        //редактирование элемента




        //запись в файл всех данных
        System.out.println("");
        saveTel();

        //загрузка из файла всех данных
        System.out.println("");
        loadTel();

    }

        //запись в файл всех данных: saveTel в текстовом файле phone.txt --метод
        private static void saveTel() throws Exception{
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("phone.txt")));
            for(Map.Entry<String,String> k: tel.entrySet()){
                writer.write(k.getKey() + " " + k.getValue()+System.lineSeparator());
            }
            writer.close();
        }

        //загрузка из файла всех данных: из текстового файла phone.txt -- метод
        public static void loadTel() throws Exception {
            File file = new File("phone.txt");
            if (file.exists()){
                BufferedReader reader = new BufferedReader(new FileReader(new File("phone.txt")));
                String ttt;
                while ((ttt=reader.readLine())!=null) {
                    String[] dat = ttt.split(" ");
                    tel.add(Integer.parseInt(dat[0]), dat[1]);
                }
                reader.close();
            }
        }
    }
