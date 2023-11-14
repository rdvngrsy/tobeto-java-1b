package org.example;

public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Rize";
        sehirler[0][2] = "Trabzon";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Samsun";
        sehirler[1][2] = "Konya";
        sehirler[2][0] = "Erzincan";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Diyarbakır";

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }
            System.out.println("---------------");
        }
    }
}