package ru.javarush.cryptoanaliser.borysov;


import ru.javarush.cryptoanaliser.borysov.contoller.MainController;
import ru.javarush.cryptoanaliser.borysov.view.Console;

public class Runner {
    public static void main(String[] args) {
        Console console = new Console();
        String command = console.run();
        MainController mainController = new MainController();
        String result = mainController.extracted(command);
        System.out.println(result);
    }
}
