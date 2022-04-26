package com.dscfgos.algorithms.strings.rotation;

public class Rotation {
    public static void main(String... args) {
        var unique = new Rotation();
        System.out.println(unique.isRotation("UncleDave", "DaveUncle"));
    }

    public boolean isRotation(String string1, String string2) {
        var string3 = string1 + string1;

        return string3.contains(string2);
    }
}
