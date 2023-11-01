package org.example;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String series1 = "ırak";
        String series2 = "rakı";
        if (anagramChecker(series1,series2)){
            System.out.println("iki string birbirinin anagramıdır.");
        }
        else {
            System.out.println("iki string birbirinin anagramı değildir.");
        }
    }
    public static boolean anagramChecker(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        char[] a1 = string1.toCharArray();
        char[] a2 = string2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);
        //Karakterleri ASCI kodlarına göre sıralıyor.

        return Arrays.equals(a1, a2);
    }
}
