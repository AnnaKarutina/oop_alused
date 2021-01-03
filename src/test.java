/*
 * Tingimuslauste kasutamise näide
 * autor - Anna Karutina
 * ülesanne 2.2
 * */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Palun sisesta punktide summa: ");
        // salvestame kasutaja sisestatud väärtus
        double punktid = sisend.nextDouble();
        // kontroll
        if (punktid >= 0 && punktid < 66) {
            System.out.println("Vähem kui kandideerimiseks vajalik");
        } else if (punktid >= 66 && punktid < 85) {
            System.out.println("Kandideerimine vastuvõtule");
        } else if (punktid >= 85 && punktid <= 100) {
            System.out.println("Vastuvõtt tagatud");
        } else if (punktid < 0 || punktid > 100) {
            System.out.println("Vigane punktisumma");
        }
    }
}
