package org.example;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String middleText = "İlginizi çekebilir.";
        String bottomText = "Vade Süresi.";

        System.out.println(bottomText);

        double dollarYesterday = 19.14;
        double dollarToday = 18.07;

        boolean dollarIsDepreciate = false;
        String arrowDirection = "";

        if(dollarYesterday < dollarToday){
            arrowDirection = "up.svg";
            System.out.println(arrowDirection);
        }else if(dollarYesterday > dollarToday){
            arrowDirection = "down.svg";
            System.out.println(arrowDirection);

        }else{
            arrowDirection = "equal.svg";
            System.out.println(arrowDirection);
        }

        //ARRAY

        String[] credit = {"Hızlı Kredi","Maaşınız Devletten","Mutlu Emekli"};

        for (int i = 0; i < credit.length; i++) {
            System.out.println(credit[i]);
        }

    }
}