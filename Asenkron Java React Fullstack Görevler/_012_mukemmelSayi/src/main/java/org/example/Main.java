package org.example;

public class Main {
    public static void main(String[] args) {
        isPerfectNumber(8128);
    }


    public static void isPerfectNumber(int num){
        int sum = 0;
        for (int i = 1; i < num ; i++) {
            if (num % i == 0){
                sum+=i;
            }
        }
        if (sum == num){
            System.out.println(num+" is a perfect number");
        }
        else {
            System.out.println(num+" is not a perfect number");
        }
    }
}