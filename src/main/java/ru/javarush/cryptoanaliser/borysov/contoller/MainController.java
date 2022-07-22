package ru.javarush.cryptoanaliser.borysov.contoller;

import ru.javarush.cryptoanaliser.borysov.service.Decode;
import ru.javarush.cryptoanaliser.borysov.service.Encode;
import ru.javarush.cryptoanaliser.borysov.view.Console;

import java.nio.file.Path;

import static ru.javarush.cryptoanaliser.borysov.service.Encode.encoder;

public class MainController {

    public MainController() {

    }

    public String extracted(String command) {
        String result =switch (command.toLowerCase()){

            case "encode"->{
                Path path=Console.encodePathView();
                String key=Console.encodePath();
                yield Encode.encoder(path,key);
            }

            case "decode"->{
                Path path=Console.decodePathView();
                String key=Console.decodePath();
                yield Decode.decoder(path,key);
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
