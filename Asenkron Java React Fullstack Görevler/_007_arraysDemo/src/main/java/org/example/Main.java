package org.example;

public class Main {
    public static void main(String[] args) {
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Rıdvan";
        ogrenciler[3] = "Esat";


        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        for (String ogrenci:ogrenciler) {
            System.out.println(ogrenci);
        }


        double[] myList = {1.2, 6.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];

        for (double number:myList) {
            if(max < number){
                max=number;
            }
            total = total+number;
            System.out.println(number);
        }


        System.out.println("Toplam= "+ total);
        System.out.println("En Büyük= "+max);
    }
}