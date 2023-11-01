package org.example;

import java.util.Scanner;

public class TwoFriendsNumberController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz");
        int number1 = scanner.nextInt();

        System.out.println("İkinci sayıyı giriniz");
        Scanner scanner1 = new Scanner(System.in);
        int number2 = scanner1.nextInt();

        int result1 = twoFriendsChecker(number1);
        int result2 = twoFriendsChecker(number2);

        if (result1 == number2 && result2 == number1) {
            System.out.println("Verdiğiniz iki sayı arkadaş sayıdır.");
        } else {
            System.out.println("Verdiğiniz iki sayı arkadaş sayı değildir.");
        }
    }

    public static int twoFriendsChecker(int number) {
        int result = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                result += i;
            }
        }
        return result;
    }
}
