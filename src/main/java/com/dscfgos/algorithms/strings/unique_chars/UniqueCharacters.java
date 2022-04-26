package com.dscfgos.algorithms.strings.unique_chars;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String... args) {
        var unique = new UniqueCharacters();
        System.out.println(unique.isUnique("Uncle"));
    }

    public boolean isUnique(String string) {
        boolean result = true;
        for (int i = 0; i < string.length(); i++) {
            var letter = string.charAt(i);
            if (string.lastIndexOf(letter) != i) {
                result = false;
                break;
            }
        }
        return result;
    }
}
