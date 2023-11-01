package org.example;

import java.util.HashSet;
import java.util.Set;

public  class UniqueCharacters {
    public static void main(String[] args) {
        String string = "Merhaba"; // Benzersiz karakterleri kontrol etmek istediğiniz dize

        if (hasUniqueCharacters(string)) {
            System.out.println("Dizide tüm karakterler benzersiz.");
        } else {
            System.out.println("Dizide tekrar eden karakterler bulunuyor.");
        }
    }

    public static boolean hasUniqueCharacters(String string) {
        Set<Character> characterSet = new HashSet<>();
        // HashSet her öğenin benzersiz olduğu bir öğe koleksiyonudur.

        for (char c : string.toCharArray()) {
            if (characterSet.contains(c)) {
                return false; // Dizide yinelenen bir karakter bulundu
            }
            characterSet.add(c);
        }

        return true; // Dizide tüm karakterler benzersiz
    }
}
