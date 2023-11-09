package org.example;

public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,3,4,5,6,7,8,9,10};
        int bulunacakSayi = 8;


        mesajVer(sayiBul(sayilar,bulunacakSayi),bulunacakSayi);
    }

    // forEach ile yapılış.
    public static boolean sayiBul(int[] sayilar, int bul){
        boolean varMi = false;
        for (int sayi:sayilar) {
            if(sayi == bul) {
                varMi = true;
                break;
            }
        }
        return varMi;
    }

    public static void mesajVer(boolean sayiBul, int bulunacakSayi){
        if (sayiBul){
            System.out.println(bulunacakSayi+" sayisi dizide vardır.");
        }else {
            System.out.println(bulunacakSayi+" sayisi dizide yoktur.");
        }
    }
}
