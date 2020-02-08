package utils;

import java.util.*;

public class StringUtil {

    public static void checkNotEmpty(String stringValue) {
        if (stringValue == null || stringValue.trim().isEmpty()) {
            throw new IllegalArgumentException("String must not be empty");
        }
    }

     public static String reverseStringWithCharArray(String initialString) {
        checkNotEmpty(initialString);

        char[] charArray = initialString.toCharArray();
        char[] result = new char[charArray.length];
        for (int i = charArray.length - 1; i >= 0; i--)
            result[i] = charArray[charArray.length - 1 - i];

        String reversedString = new String(result);
        return reversedString;
    }

    public static String reverseStringWithCharSwapping(String initialString) {
        checkNotEmpty(initialString);

        char[] charArray = initialString.toCharArray();
        int leftEnd = 0;
        int rightEnd = charArray.length - 1;

        for (leftEnd = 0; leftEnd < rightEnd; leftEnd++, rightEnd--) {
            // Swap values of left and right
            char swappedChar = charArray[leftEnd];
            charArray[leftEnd] = charArray[rightEnd];
            charArray[rightEnd] = swappedChar;
        }

        String reversedString = new String(charArray);
        return reversedString;
    }

    public static String reverseStringWithStringBuilder(String initialString) {
        checkNotEmpty(initialString);

        StringBuilder reversedStringBuilder = new StringBuilder(initialString.length());
        // hello
        // 01234
        // 4 -> o -> o
        // 3 -> l -> ol
        // 2 -> l -> oll
        // 1 -> e -> olle
        // 0 -> h -> olleh
        // -1 -> stop
        // olleh
        for (int i = initialString.length() - 1; i >= 0; --i) {
            reversedStringBuilder.append(initialString.charAt(i));
        }
        return reversedStringBuilder.toString();
    }

    private StringUtil() {
    }

}
