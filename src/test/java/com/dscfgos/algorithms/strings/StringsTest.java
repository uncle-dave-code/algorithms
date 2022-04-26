package com.dscfgos.algorithms.strings;

import com.dscfgos.algorithms.strings.anagram.Anagram;
import com.dscfgos.algorithms.strings.reverse.Reverse;
import com.dscfgos.algorithms.strings.rotation.Rotation;
import com.dscfgos.algorithms.strings.unique_chars.UniqueCharacters;
import org.junit.jupiter.api.Assertions;

class StringsTest {

    @org.junit.jupiter.api.Test
    void reverseTest() {
        var reverseString = new Reverse();
        Assertions.assertEquals("edoC s'evaD elcnU", reverseString.reverse("Uncle Dave's Code"));
    }

    @org.junit.jupiter.api.Test
    void reverseStringBuilderTest() {
        var reverseString = new Reverse();
        Assertions.assertEquals("edoC s'evaD elcnU", reverseString.reverseSB("Uncle Dave's Code"));
    }

    @org.junit.jupiter.api.Test
    void isAnagram() {
        var anagram = new Anagram();
        Assertions.assertTrue(anagram.isAnagram("restful", "fluster"));
        Assertions.assertFalse(anagram.isAnagram("Uncle", "Dave"));

    }

    @org.junit.jupiter.api.Test
    void isAnagramSort() {
        var anagram = new Anagram();
        Assertions.assertTrue(anagram.isAnagramSort("restful", "fluster"));
        Assertions.assertFalse(anagram.isAnagramSort("Uncle", "Dave"));

    }

    @org.junit.jupiter.api.Test
    void isUnique() {
        var unique = new UniqueCharacters();
        Assertions.assertTrue(unique.isUnique("Uncle"));
        Assertions.assertFalse(unique.isUnique("Uncle Dave"));

    }

    @org.junit.jupiter.api.Test
    void isRotate() {
        var rotation = new Rotation();
        Assertions.assertTrue(rotation.isRotation("UncleDave","DaveUncle"));
        Assertions.assertFalse(rotation.isRotation("Uncle Dave","Dave Uncle"));

    }
}