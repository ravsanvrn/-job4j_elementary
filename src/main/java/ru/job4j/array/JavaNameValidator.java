package ru.job4j.array;

import static java.lang.Character.*;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        if (name.isEmpty() || !isLowerLatinLetter(name.codePointAt(0))) {
            return false;
        }
        for (int i = 1; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (!isSpecialSymbol(code) && !isUpperLatinLetter(code) && !isLowerLatinLetter(code) && !isDigit(code)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return isUpperCase(code) && code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return isLowerCase(code) && code >= 97 && code <= 122;
    }
}