package org.example;

public class AmicableNumbersFinder {
    public static void main(String[] args) {
        findAmicablePairs(1, 3000); // İlk 3000 sayı arasında arkadaş sayıları bulur
    }

    public static void findAmicablePairs(int start, int end) {
        int j = 1;
        for (int num1 = start; num1 <= end; num1++) {
            int num2 = sumOfDivisors(num1);

            if (num1 < num2 && num2 <= end && sumOfDivisors(num2) == num1) {
                System.out.println(j + ". arkadaş çift: " + num1 + " ve " + num2);
                j++;
            }
        }
    }

    public static int sumOfDivisors(int num) {
        int sum = 1; // Kendi dahil
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                sum += i;

            }
        }
        return sum;
    }
}
