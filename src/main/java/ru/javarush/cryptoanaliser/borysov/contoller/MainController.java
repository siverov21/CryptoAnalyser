package ru.javarush.cryptoanaliser.borysov.contoller;

import ru.javarush.cryptoanaliser.borysov.service.BruteForce;
import ru.javarush.cryptoanaliser.borysov.service.Decode;
import ru.javarush.cryptoanaliser.borysov.service.Encode;
import ru.javarush.cryptoanaliser.borysov.view.Console;

import java.nio.file.Path;

public class MainController {

    public MainController() {

    }

    public String extracted(String command) {
        return switch (command.toLowerCase()){

            case "encode"->{
                Path pathInputFile=Console.encodePathView();
                Path pathOutputFile=Console.loadFile();
                int key=Console.encodePath();

                yield Encode.encoder(pathInputFile,pathOutputFile,key);
            }

            case "decode"->{
                Path pathInputFile=Console.decodePathView();
                Path pathOutputFile=Console.loadFile();
                int key=Console.decodePath();
                yield Decode.decoder(pathInputFile,pathOutputFile,key);
            }
            case "bruteforce"->{
                Path pathInputFile=Console.decodePathView();
                Path pathOutputFile=Console.loadFile();
                yield BruteForce.brute(pathInputFile,pathOutputFile);
            }
            default ->{
                yield "Такой команды не существует";
            }
        };
    }
}
