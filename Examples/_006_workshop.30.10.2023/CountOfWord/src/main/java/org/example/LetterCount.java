package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir cümle yazınız: ");
        String metin = scan.nextLine();


        Map<Character, Integer> karakterAdetleri = new HashMap<>();
        for (int i = 0; i < metin.length(); i++) {
            char karakter = metin.charAt(i);

            // Eğer karakter zaten haritada varsa, adetini bir artır.
            if (karakterAdetleri.containsKey(karakter)) {
                karakterAdetleri.put(karakter, karakterAdetleri.get(karakter) + 1);
                //t           2
            } else {
                // Eğer karakter haritada yoksa, yeni bir giriş oluştur.
                karakterAdetleri.put(karakter, 1);
            }
        }

        System.out.println(karakterAdetleri.entrySet());



    }
}
