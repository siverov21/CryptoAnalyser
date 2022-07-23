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
                    int origCharIndexInAlphabet = Alphabet.ALPHABET.indexOf(origChar);
                    int decryptedIndex = (origCharIndexInAlphabet - key) % Alphabet.ALPHABET.length();
                    if (decryptedIndex < 0) {
                        decryptedIndex += Alphabet.ALPHABET.length();
                    }
                    char newCharacter = Alphabet.ALPHABET.charAt(decryptedIndex);
                    writer.write(newCharacter);
                }
            }
        } catch (IOException e) {
            throw new ArithmeticException(e.getMessage());
        }
        return "Файл был успешно раскодирован";
    }
}

