/*
 * meetod + return -  näide
 * autor - Anna Karutina
 * ülesanne 6.2
 * */

import java.util.Scanner;

public class test {
    // mahlapakkideArv meetod
    static int mahlapakkideArv(double ounteKogus) {
        int pakkideArv = (int) Math.round(ounteKogus * 0.4 / 3);
        return pakkideArv;
    }

    // main meetod
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage õunte kogus kilogrammides: ");
        // salvestame kasutaja sisestatud väärtus
        double ountekogus = sisend.nextDouble();
        // arvutamine
        System.out.println(mahlapakkideArv(ountekogus));
    }
}
