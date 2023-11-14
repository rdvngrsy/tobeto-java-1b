package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        findNumber(numbers,7);
    }


    public static void findNumber(int[] numbers, int number){
        boolean finded = false;
        for (int findNumber:numbers) {
            if (findNumber == number){
                finded = true;
                break;
            }
        }
        if (finded){
            System.out.println(number+ " sayısı array' de bulunmaktadır.");
        }else {
            System.out.println(number+ " sayısı array' de bulunmamaktadır.");
        }
    }
}