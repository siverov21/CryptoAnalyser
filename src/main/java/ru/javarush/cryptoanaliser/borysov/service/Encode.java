package ru.javarush.cryptoanaliser.borysov.service;

import ru.javarush.cryptoanaliser.borysov.constants.Alphabet;

import java.io.*;
import java.nio.file.Path;

public class Encode {


    public static String encoder(Path pathLoadFile, Path pathOutputFile, int key) {


        try (Reader reader = new FileReader(String.valueOf(pathLoadFile));
             Writer writer = new FileWriter(String.valueOf(pathOutputFile))
        ) {
            while (reader.ready()) {
                int indexChar = reader.read();
                char origChar = (char) indexChar;
                if (Alphabet.ALPHABET.indexOf(indexChar) != -1) {
                    int origCharIndexInAlphabet = Alphabet.ALPHABET.indexOf(origChar);
                    int encryptedChar = (origCharIndexInAlphabet + key) % Alphabet.ALPHABET.length();
                    char newChar = Alphabet.ALPHABET.charAt(encryptedChar);
                    writer.write(newChar);
                }
            }
            return "Файл был успешно закодирован";
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
