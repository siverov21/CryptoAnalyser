package ru.javarush.cryptoanaliser.borysov.service;

import ru.javarush.cryptoanaliser.borysov.constants.Alphabet;

import java.io.*;
import java.nio.file.Path;

public class Encode {


    public static String encoder(Path pathLoadFile, Path pathOutputFile, int key) {

        String alphabet = Alphabet.ALPHABET;

        try (Reader reader = new FileReader(String.valueOf(pathLoadFile));
             Writer writer = new FileWriter(String.valueOf(pathOutputFile))

        ) {
            while (reader.ready()) {
                int originalChar = reader.read();
                char origChar = (char) reader.read();
                if (alphabet.indexOf(originalChar) != -1) {

                    int origCharIndexInAlphabet = alphabet.indexOf(origChar);
                    int encryptedChar = (origCharIndexInAlphabet + key) % alphabet.length();
                    char newCharacter = alphabet.charAt(encryptedChar);
                    writer.write(newCharacter);


                }
            }
            return "Файл был успешно закодирован";

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
