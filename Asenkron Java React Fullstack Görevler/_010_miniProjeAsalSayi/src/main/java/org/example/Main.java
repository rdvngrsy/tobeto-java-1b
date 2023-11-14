package org.example;

public class Main {
    public static void main(String[] args) {
        isPrime(5);
    }


    public static void isPrime(int number){
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0){
                count+=1;
            }
        }
        if (count == 2){
            System.out.println(number + " is prime.");
        } else if (number < 1) {
            System.out.println("Invalid number.");
        } else{
            System.out.println(number + " is not prime.");
        }
    }
}