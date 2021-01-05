/*
 * while tsükkel -  näide
 * autor - Anna Karutina
 * ülesanne 3.1
 * */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Täringute arv: ");
        // salvestame kasutaja sisestatud väärtus
        int taringuteArv = sisend.nextInt();
        // korduv tegevus
        int taring = (int) Math.round(Math.random() * 6);
        System.out.println(taring);
        // kontroll
        while (taring != taringuteArv) {
            taring = (int) Math.round(Math.random() * 6);
            System.out.println(taring);
        }
    }
}
