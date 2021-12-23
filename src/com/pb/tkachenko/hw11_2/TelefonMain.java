package com.pb.tkachenko.hw11_2;

import javafx.beans.binding.MapExpression;

import java.io.*;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

import static sun.nio.ch.IOUtil.load;

public class TelefonMain {

    private static Object String;

    public TelefonMain() throws IOException {
    }

    public static void main(String[] args) throws Exception {

        List<String> tel = Arrays.asList();
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Ткаченко Юлия Васильевна", "11.03.1981", "Днепр", "0677029726", LocalDate.of(1998, 03, 11)));
        contacts.add(new Contact("Иванов Иван Иванович", "14.03.2003", "Киев", "0677654321", LocalDate.of(1997, 03, 14)));
        contacts.add(new Contact("Петров Петр Петрович", "11.12.2017", "Запорожье", "09956423, 098765431", LocalDate.of(1995, 12, 11)));

        //добавление элемента
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String newFIO = scan.nextLine();
        System.out.print("Введите адрес: ");
        String newAdres = scan.nextLine();
        System.out.print("Введите дату рождения: ");
        String newBDate = scan.nextLine();
        System.out.print("Введите телефон: ");
        List<String> newTel = Collections.singletonList(scan.nextLine());

        Contact newContact = new Contact(newFIO, newBDate, newAdres, (ArrayList<java.lang.String>) newTel);
        contacts.add(newContact);

        //удаление элемента: принимает телефон
        System.out.println("Введите телефон для удаления контакта: ");
        String delTel = scan.nextLine();
        tel.remove(tel);
        System.out.println("Удалено.");

        //поиск элементов
        System.out.println("Введите телефон для поиска контактов: ");
        Integer findTel = Integer.valueOf(scan.nextLine());
        Contact result = contacts.get(findTel);
        if (result != null) {
            System.out.println("Поиск по номеру телефона: телефон " + findTel + " принадлежит " + result.FIO);
        } else
            System.out.println("Такого номера нет в телефонной книге.");


        //вывод всех записей с сортировкой по указанному полю (можно ограничиться двумя на выбор)
        // Сортировка по FIO
        System.out.println("Вывод всех контактов с сортировкой по ФИО. ");
        //Comparator<Message> comparator = Comparator.comparing(obj -> obj.getId());
        contacts.sort(Comparator.comparing(obj -> obj.getFIO()));
        System.out.println("Сортировка по ФИО:" + contacts);

        // Сортировка по adres
        System.out.println("Вывод всех контактов с сортировкой по адресу. ");
        contacts.sort(Comparator.comparing(obj -> obj.getAdres()));
        System.out.println("Сортировка по адресу: " + contacts);

        //редактирование элемента
        Scanner Input = new Scanner(System.in);
        int Punkt = 0;
        while (true) {
            System.out.print("Что нужно изменить?");

            System.out.print("ФИО? - 1");
            System.out.print("Дата рождения? - 2");
            System.out.print("Адрес? - 3");
            System.out.print("Телефон? - 4");
            System.out.print("Выход - 0");
            Punkt = Input.nextInt();

            if (Punkt == 0) {
                System.out.println("Выход");
                break;
            } else
            {switch (Punkt){
                case 1 -> {
                    System.out.println("Введите ФИО: ");
                    String FIOnew = Input.nextLine();
                    Contact.setFIO(FIOnew);
                    break;
                }
                case 2 -> {
                    System.out.print("Введите дату рождения: ");
                    String BDateNew = Input.nextLine();
                    Contact.setbDate(BDateNew);
                    break;
                }
                case 3 -> {
                    System.out.print("Введите адрес: ");
                    String AdresNew = Input.nextLine();
                    Contact.setAdres(AdresNew);
                    break;
                }
                case 4 -> {
                    System.out.print("Введите телефон: ");
                    String TelNew = Input.nextLine();
                    Contact.setTel(TelNew);
                    break;
                }
            }
            }
        }







        //запись в файл всех данных
        //System.out.println("");
        //saveTel();

        //загрузка из файла всех данных
        //System.out.println("");
        //loadTel();


        //запись в файл всех данных 2
        File file = Paths.get("TelBook.txt").toFile();
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        // сохраняем в файл
        objectOutputStream.writeObject(contacts);
        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();
        System.out.println("Файл записан");


        File file2 = Paths.get("files/person.data").toFile();
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Contact> contacts1 = (List<Contact>) objectInputStream.readObject();
        System.out.println(contacts1);

        }


    }
        //запись в файл всех данных: saveTel в текстовом файле phone.txt --метод
        //private static void saveTel() throws Exception{
        //BufferedWriter writer = new BufferedWriter(new FileWriter(new File("phone.txt")));
        //for(Map.Entry<String,String> k: tel.entrySet()){
        //writer.write(k.getKey() + " " + k.getValue()+System.lineSeparator());
        //}
        //writer.close();
        //}

        //загрузка из файла всех данных: из текстового файла phone.txt -- метод
        //public static void loadTel() throws Exception {
        //    File file = new File("phone.txt");
        //    if (file.exists()){
        //        BufferedReader reader = new BufferedReader(new FileReader(new File("phone.txt")));
        //        String ttt;
        //        while ((ttt=reader.readLine())!=null) {
        //            String[] dat = ttt.split(" ");
        //            tel.add(Integer.parseInt(dat[0]), dat[1]);
        //        }
        //        reader.close();
        //    }
        //}
