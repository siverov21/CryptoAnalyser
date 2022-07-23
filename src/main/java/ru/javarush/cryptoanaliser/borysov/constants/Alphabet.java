package ru.javarush.cryptoanaliser.borysov.constants;

public class Alphabet {
    private static final String rus = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static final String numbers = "1234567890";
    private static final String symbols = "—,.!?/;'\"<>«»:[]{}_=+-@ \n";
    public static final String ALPHABET = rus + rus.toLowerCase() + numbers + symbols;

}
