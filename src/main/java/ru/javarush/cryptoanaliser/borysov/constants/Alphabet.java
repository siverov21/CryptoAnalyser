package ru.javarush.cryptoanaliser.borysov.constants;

import java.util.Locale;

public class Alphabet {
    private static final String rus = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

    public static final String eng = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String numbers = "1234567890";
    private static final String symbols = "—,.!?/;'\"<>«»:[]{}_=+-@ \n";
    public static final String ALPHABET = rus + rus.toLowerCase()+ eng + eng.toLowerCase(Locale.ROOT) + numbers + symbols;



}
