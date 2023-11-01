package org.example;

import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = input.nextInt();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(number + " bir Armstrong sayısı değildir.");
        }
    }

    // Bir sayının Armstrong sayısı olup olmadığını kontrol eden fonksiyon
    public static boolean isArmstrongNumber(int num) {
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = num;

        // Sayının basamak sayısını bulma
        for (; originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = num;
        for (; originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        return result == num;
    }
}