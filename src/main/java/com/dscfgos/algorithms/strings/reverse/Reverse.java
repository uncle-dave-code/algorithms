package com.dscfgos.algorithms.strings.reverse;

public class Reverse {
    public static void main(String... args) {
        var reverseString = new Reverse();
        System.out.println(reverseString.reverse("Uncle Dave's Code"));
    }

    public String reverse(String string) {
        String result = "";
        if (string != null) {
            for (int i = string.length() - 1; i >= 0; i--) {
                result += string.charAt(i);
            }
        }
        return result;
    }

    public String reverseSB(String string) {
        var sb = new StringBuilder();

        if (string != null) {
            sb.append(string);
            sb.reverse();
        }
        return sb.toString();
    }


}
