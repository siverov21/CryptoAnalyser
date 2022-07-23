package ru.javarush.cryptoanaliser.borysov.service;

import ru.javarush.cryptoanaliser.borysov.constants.Alphabet;

import java.io.*;
import java.nio.file.Path;

public class Decode {
    public static String decoder(Path pathInputFile, Path pathOutputFile, int key) {

        String alphabet = Alphabet.ALPHABET;

        try (Reader reader = new FileReader(String.valueOf(pathInputFile));
             Writer writer = new FileWriter(String.valueOf(pathOutputFile))

        ) {

            while (reader.ready()) {
                int originalChar = reader.read();
                char origChar = (char) reader.read();
                if (alphabet.indexOf(origChar) != -1) {

                    int origCharIndexInAlphabet = alphabet.indexOf(origChar);
                    int decryptedIndex = (origCharIndexInAlphabet - key) % alphabet.length();
                    if (decryptedIndex < 0) {
                        decryptedIndex += alphabet.length();
                    }
                    char newCharacter = alphabet.charAt(decryptedIndex);
                    writer.write(newCharacter);


                }
            }

        } catch (IOException e) {
            throw new ArithmeticException(e.getMessage());
        }
        return "Файл был успешно раскодирован";
    }
}

