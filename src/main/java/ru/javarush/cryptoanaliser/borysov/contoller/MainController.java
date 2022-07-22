package ru.javarush.cryptoanaliser.borysov.contoller;

import ru.javarush.cryptoanaliser.borysov.service.Decode;
import ru.javarush.cryptoanaliser.borysov.service.Encode;
import ru.javarush.cryptoanaliser.borysov.view.Console;

import java.nio.file.Path;

public class MainController {

    public MainController() {

    }

    public String extracted(String command) {
        String result =switch (command.toLowerCase()){

            case "encode"->{
                Path pathLoadFile=Console.encodePathView();
                Path pathOutputFile=Console.loadFile();
                String key=Console.encodePath();

                yield Encode.encoder(pathLoadFile,pathOutputFile,key);
            }

            case "decode"->{
                Path pathLoadFile=Console.decodePathView();
                Path pathOutputFile=Console.loadFile();
                String key=Console.decodePath();
                yield Decode.decoder(pathLoadFile,pathOutputFile,key);
            }
            case "bruteforce"->{
                yield "f";
            }
            default ->{
                yield "Ошибка";
            }
        };
        return result;
    }
}
