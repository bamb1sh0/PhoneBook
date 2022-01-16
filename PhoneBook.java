package com.company;

import java.io.*;
import java.util.ArrayList;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        //loadPB();
        String main;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("выбор действия: (1)добавить данные, (2)просотр всех записей, (3)поиск (4)выход");
        main = bf.readLine();
        while (!main.equals("4")) {
            //добавление записи
            if (main.equals("1")) {
                System.out.println("Введите имя:");
                String name = bf.readLine();
                System.out.println("Введите фамилию:");
                String surname = bf.readLine();
                System.out.println("Введите ник:");
                String nickname = bf.readLine();
                System.out.println("Введите телефон:");
                String phoneNumber = bf.readLine();
                System.out.println("Введите mail:");
                String email = bf.readLine();
                System.out.println("Введите год рождения:");
                String yearOfBirth = bf.readLine();
                pb.add(createPerson(name, surname, nickname, phoneNumber, email, yearOfBirth));
            }
            if (main.equals("2")) {
                showAll();
            }

            if (main.equals("3")) {
                System.out.println("Выберите действие: (1)Поиск по имени, (2)Поиск по телефону");
                search(bf.readLine(), bf.readLine());
            }
            if (main.equals("save")) {
                save();
            }


            System.out.println("выбор действия: (1)добавить данные, (2)просотр всех записей, (3)поиск (4)выход");
            main = bf.readLine();


        }


    }


    private static ArrayList<Person> pb = new ArrayList<>();

    public static Person createPerson(String name, String surname, String nickname, String phoneNumber, String email, String yearOfBirth) {
        return new Person(name, surname, nickname, phoneNumber, email, yearOfBirth);
    }

    public static void addPerson(Person person) {
        pb.add(person);
    }

    public static void showAll() {
        System.out.println("Список контактов: ");
        for (Person person : pb) {
            System.out.println(person);
        }
    }

    // Поиск контакта
    public static void search(String searchType, String searchString) {

        switch (searchType) {
            case "1":
                for (Person persons : pb) {
                    if (persons.name.equals(searchString)) {
                        System.out.println(persons.name + ' ' +persons.surname + ' ' +persons.nickname+ ' ' +persons.phoneNumber+ ' '
                                +persons.email+ ' ' +persons.yearOfBirth);
                    }
                    if (persons.name.equals((searchString)) == false) {
                        System.out.println("Такого пользователя нет");
                    }
                }
                break;
            case "2":
                for (Person persons : pb) {
                    if (persons.phoneNumber.equals(searchString)) {
                        System.out.println(persons.name + ' ' +persons.surname + ' ' +persons.nickname+ ' ' +persons.phoneNumber+ ' '
                                +persons.email+ ' ' +persons.yearOfBirth);
                    }
                    if (persons.phoneNumber.equals((searchString)) == false) {
                        System.out.println("Такого пользователя нет");
                    }
                }
                break;

        }

    }

    public static void save() throws IOException {
        BufferedWriter pw = new BufferedWriter(new FileWriter(new File("D:\\fileName.txt")));
        for (Person person : pb)
            pw.write(String.valueOf(pb));
        pw.close();
    }
}

//        public static void loadPB() throws IOException {
//        File file = new File("D:\\fileName.txt");
//        if (file.exists()) {
//            BufferedReader reader = new BufferedReader(new FileReader("D:\\fileName.txt"));
//            String main;
//            while ((main = reader.readLine()) != null){
//                pb.add(main);
//            }
//        }
//
//    }
//    public static void loadPB() {
//        try (Scanner scanner = new Scanner(new File("D:\\fileName.txt"))) {
//            String a = scanner.nextLine();
//            String s = scanner.nextLine();
//            String b = scanner.nextLine();
//
//            System.out.println(a + ", " + s + ", " + b);
//        } catch (FileNotFoundException e) {
//            // Handle a potential exception
//        }
//    }
//    public static String loadPB() throws IOException {
//        BufferedReader bufReader = new BufferedReader(new FileReader("D:\\fileName.txt"));
//        ArrayList<String> listOfLines = new ArrayList<>();
//        String line = bufReader.readLine();
//        while (line != null) {
//            listOfLines.add(line);
//            line = bufReader.readLine();
//        }
//        bufReader.close();
//        return line;
//    }
//}










