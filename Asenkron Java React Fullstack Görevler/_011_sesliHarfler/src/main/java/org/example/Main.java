package org.example;

public class Main {
    public static void main(String[] args) {
        isVowel('C');
    }


    public static void isVowel(char letter){
        switch (letter){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(letter+" Kalın sesli harf.");
                break;
            default:
                System.out.println(letter+" İnce sesli harf.");
        }
    }
}