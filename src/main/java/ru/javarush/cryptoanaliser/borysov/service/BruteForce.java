package ru.javarush.cryptoanaliser.borysov.service;

import ru.javarush.cryptoanaliser.borysov.constants.Alphabet;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BruteForce {


    public static String brute(Path pathInputFile, Path pathOutputFile) {

        //Этот метод корректно не работает.

        for (int i = 1; i < 34; i++) {
            String i2= String.valueOf(i);
            Path path2 = Path.of(String.valueOf(i2+pathOutputFile.getFileName()));
            Decode.decoder(pathInputFile,path2,i);
        }


        return "Пока что функция работает только так \nОдин из файлов точно подойдет! ";

    }
}
