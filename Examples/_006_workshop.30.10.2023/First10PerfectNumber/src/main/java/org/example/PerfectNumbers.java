package org.example;

public class PerfectNumbers {
    public static void main(String[] args) {
        findAmicablePairs();
    }
    public static void findAmicablePairs() {
        int j = 1;
        for (long num1 = 8128; j < 10; num1++) {

            if (num1 == sumOfDivisors(num1)) {
                System.out.println(num1 + " : mükemmel sayıdır.");
                j++;
            }
        }
    }
    public static long sumOfDivisors(long num) {
        long sum = 1;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                sum += i;

            }
        }
        return sum;
    }
}
