package org.example;

import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        int number = 154;

        if (ArmstrongNumberChecker(number)){
            System.out.println(number + " : Bu bir armstrong sayıdır.");
        }
        else {
            System.out.println(number + " : Bu bir armstrong sayısı değildir.");
        }
    }

    public static boolean ArmstrongNumberChecker(int number){
        int sum = 0;
        int originalNumber = number;
        int numDigit = String.valueOf(number).length();

        while(number>0){
            int digit = number % 10;
            sum += (int) Math.pow(digit,numDigit);
            number /=10;
        }

        return sum == originalNumber;
    }
}
