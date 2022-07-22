package ru.javarush.cryptoanaliser.borysov.constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Alphabet {
    private static final Character[] CHARS = {'а', 'б', 'в', 'г', 'д', 'е','ё', 'ж', 'з',
            'и','й','к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э','ю', 'я','.', ',', '«', '»', ':', '—', '!', '?', '\'', ' '};


    public static final ArrayList<Character> ALPHABET=new ArrayList<>(Arrays.asList(CHARS));

}
