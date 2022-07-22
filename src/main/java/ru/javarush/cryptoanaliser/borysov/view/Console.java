package ru.javarush.cryptoanaliser.borysov.view;

import java.nio.file.Path;
import java.util.Scanner;

public class Console {
    public Console(){

    }

    static Scanner scanner = new Scanner(System.in);


    public static String run() {
        System.out.println("Выберите один из вариантов : ");
        System.out.println("1. Encode");
        System.out.println("2. Decode");
        System.out.println("3. BruteForce");
        return scanner.nextLine();
    }

    public static Path encodePathView(){
        System.out.print("Введите путь файла, который нужно закодировать: ");
        Path path = Path.of(scanner.nextLine());
        return path;
    }
    public static String encodePath(){
        System.out.println("Введите ключ для кодировки:");
        return scanner.next();
    }


    public static Path decodePathView() {
        System.out.println("Введите путь файла, который нужно раскодировать");
        Path path = Path.of(scanner.nextLine());
        return path;
    }

    public static String decodePath() {
        System.out.println("Введите ключ для раскодировки:");
        return scanner.next();
    }

    public static Path loadFile() {
        System.out.println("Введите путь файла, куда нужно сохранить файл");
        Path path = Path.of(scanner.nextLine());
        return path;
    }
}
