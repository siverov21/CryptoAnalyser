package ru.javarush.cryptoanaliser.borysov.service;

import ru.javarush.cryptoanaliser.borysov.constants.Alphabet;

import java.io.*;
import java.nio.file.Path;

public class Decode {
    public static String decoder(Path pathInputFile, Path pathOutputFile, int key) {

        try (Reader reader = new FileReader(String.valueOf(pathInputFile));
             Writer writer = new FileWriter(String.valueOf(pathOutputFile))
        ) {
            while (reader.ready()) {
                int indexChar = reader.read();
                char origChar = (char) indexChar;
                if (Alphabet.ALPHABET.indexOf(indexChar) != -1) {
                    int indexCharAlphabet = Alphabet.ALPHABET.indexOf(origChar);
                    int decodeChar = (indexCharAlphabet - key) % Alphabet.ALPHABET.length();
                    if (decodeChar < 0) {
                        decodeChar += Alphabet.ALPHABET.length();
                    }
                    char newChar = Alphabet.ALPHABET.charAt(decodeChar);
                    writer.write(newChar);
                }
            }
        } catch (IOException e) {
            throw new ArithmeticException(e.getMessage());
        }
        return "Файл был успешно раскодирован";
    }
}

