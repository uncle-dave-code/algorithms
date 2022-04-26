package com.dscfgos.algorithms.strings.anagram;

import java.util.Arrays;

public class Anagram {
    public static void main(String... args) {
        var anagram = new Anagram();
        System.out.println(anagram.isAnagramSort("restful", "fluster"));
    }

    public boolean isAnagram(String string, String anagram) {
        if (anagram.length() == string.length()) {
            for (int i = 0; i < string.length(); i++) {
                var index = anagram.indexOf(string.charAt(i));
                if (index != -1) {
                    anagram = anagram.substring(0, index) + anagram.substring(index + 1);
                } else {
                    break;
                }
            }
        }

        return anagram.isEmpty();
    }

    public boolean isAnagramSort(String string, String anagram) {

        if (anagram.length() == string.length()) {
            var word1 = string.toCharArray();
            var word2 = anagram.toCharArray();
            Arrays.sort(word1);
            Arrays.sort(word2);

            string = String.valueOf(word1);
            anagram = String.valueOf(word2);
        }

        return anagram.equals(string);
    }

}
