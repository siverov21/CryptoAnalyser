package ru.javarush.cryptoanaliser.borysov.service;

import ru.javarush.cryptoanaliser.borysov.constants.Alphabet;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;

public class Encode {
    public Encode(Path path, String key) {}


    public static String encoder(Path pathLoadFile, Path pathOutputFile, String key) {

        String alphabet = Alphabet.ALPHABET;

        try (Reader reader = new FileReader(String.valueOf(pathLoadFile));
             Writer writer = new FileWriter(String.valueOf(pathOutputFile))

        ) {
            while (reader.ready()) {
                char key2 = (char) key.indexOf(0);
                int originalChar = reader.read();
                char origChar = (char) reader.read();
                if (alphabet.indexOf(originalChar) != -1) {

                    int origCharIndexInAlphabet = alphabet.indexOf(origChar);
                    int encryptedChar = (origCharIndexInAlphabet + (int) key2) % alphabet.length();
                    char newCharacter = alphabet.charAt(encryptedChar);
                    writer.write(newCharacter);


                }
            }
            return "заглушка";

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
