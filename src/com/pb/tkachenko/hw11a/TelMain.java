package com.pb.tkachenko.hw11a;

import java.io.*;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;

public class TelMain {

    public TelMain() {
    }

    public static void main(String[] args) throws Exception {

        List<String> tel = Arrays.asList();
        ArrayList<Contact> contacts = new ArrayList<>();
        List<String> phone1 = Arrays.asList("0987654315", "0677654321", "0677029726");
        List<String> phone2 = Arrays.asList("0995642370");
        List<String> phone3 = Arrays.asList("0939780423", "0991234567");

        contacts.add(new Contact("Ткаченко Юлия Васильевна", "11.03.1981", "Днепр", phone1, LocalDate.of(1998, 03, 11)));
        contacts.add(new Contact("Иванов Иван Иванович", "14.03.2003", "Киев", phone2, LocalDate.of(1997, 03, 14)));
        contacts.add(new Contact("Петров Петр Петрович", "11.12.2017", "Запорожье", phone3, LocalDate.of(1995, 12, 11)));

        //добавление элемента
        Scanner scan = new Scanner(System.in);
        System.out.println("Добавляем контакт");
        System.out.print("Введите ФИО: ");
        String newFIO = scan.nextLine();
        System.out.print("Введите адрес: ");
        String newAdres = scan.nextLine();
        System.out.print("Введите дату рождения: ");
        String newBDate = scan.nextLine();
        System.out.print("Введите телефоны: ");
        List<String> newTel = Collections.singletonList(scan.nextLine());

        Contact contact = new Contact(newFIO, newBDate, newAdres, newTel);
        contacts.add(contact);

        //удаление элемента: принимает телефон
        System.out.println("Введите телефон для удаления контакта: ");
        String delTel = scan.nextLine();
        tel.remove(tel);
        System.out.println("Удалено.");

        //поиск элементов
        System.out.println("Введите телефон для поиска контактов: ");
        String findTel = scan.nextLine();
        //Contact result = contacts.get(findTel);
        List<Contact> result = new ArrayList<>();
        for (Contact c : contacts) {
            for (String number : c.getTel()) {
                if (number.contains(findTel)) {
                    result.add(c);
                    break;
                }
            }
            System.out.println("Поиск по номеру телефона: " + result);
        }
        System.out.println("Такого номера нет в телефонной книге.");

        //вывод всех записей с сортировкой по указанному полю (можно ограничиться двумя на выбор)
        // Сортировка по FIO
        System.out.println("Вывод всех контактов с сортировкой по ФИО. ");

        Comparator<Contact> comparator = new Comparator<Contact>() {
            @Override
            public int compare(Contact contact1, Contact contact2) {
                return contact1.getFIO().compareTo(contact2.getFIO());
            }
        };
        System.out.println("Сортировка по ФИО:" + contacts);


        // Сортировка по adres
        System.out.println("Вывод всех контактов с сортировкой по адресу. ");
        Comparator<Contact> comparator2 = (contact1, contact2) -> contact1.getFIO().compareTo(contact2.getFIO());
        System.out.println("Сортировка по адресу: " + contacts);

        //редактирование элемента
        Scanner Input = new Scanner(System.in);
        while (true) {
            System.out.print("Что нужно изменить?");

            System.out.print("ФИО? - 1");
            System.out.print("Дата рождения? - 2");
            System.out.print("Адрес? - 3");
            System.out.print("Телефон? - 4");
            System.out.println("Выход - 0");
            String Punkt = scan.nextLine();
            switch (Punkt) {
                case "1":
                    System.out.println("Введите ФИО: ");
                    String FIO = scan.nextLine();
                    contact.setFIO(FIO);
                    break;
                case "2":
                    System.out.print("Введите дату рождения: ");
                    String BDateNew = Input.nextLine();
                    contact.setbDate(BDateNew);
                    break;
                case "3":
                    System.out.print("Введите адрес: ");
                    String AdresNew = Input.nextLine();
                    contact.setAdres(AdresNew);
                    break;
                case "4":
                    System.out.print("Введите телефон: ");
                    String TelNew = Input.nextLine();
                    contact.setTel(TelNew);
                    break;
                default:
                    return;
            }

            //запись в файл всех данных 2
            File file = Paths.get("TelBook.txt").toFile();
            FileOutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            // сохраняем в файл
            objectOutputStream.writeObject(contacts);
            //закрываем поток и освобождаем ресурсы
            objectOutputStream.close();
            System.out.println("Файл записан");

            File file2 = Paths.get("person.data").toFile();
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Contact> contacts1 = (List<Contact>) objectInputStream.readObject();
            System.out.println(contacts1);
        }
    }
}
