package org.example;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 100; // İlk 100 Fibonacci terimini hesaplamak için n'i ayarlayın
        printFibonacciSeries(n);
    }

    // Fibonacci serisini hesaplayıp yazdıran fonksiyon
    public static void printFibonacciSeries(int n) {
        long firstTerm = 0;
        long secondTerm = 1;

        System.out.println("Fibonacci Serisi (İlk " + n + " Terim):");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            long nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}