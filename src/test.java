/*
 * muutujad ja andmetüübid -  näide
 * autor - Anna Karutina
 * ülesanne 1.4a
 * */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage ainepunktide arv: ");
        // salvestame kasutaja sisestatud väärtus
        int punktid = sisend.nextInt();
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage nädalate arv: ");
        // salvestame kasutaja sisestatud väärtus
        int nadalad = sisend.nextInt();
        // arvutamine
        // selleks, et komaga asi tekkiks peaks olema mingi väärtus -
        // kas ülemine või alumine double väärtuseks teisendatud
        double tunnid = (double) (26 * punktid) / nadalad;
        // nüüd ümmardame
        double tunnidYmmardatud = Math.round(tunnid);
        // nüüd lõikame komaosa
        int tunnidTaisarvuna = (int) tunnidYmmardatud;
        // väljastame
        System.out.println(tunnidTaisarvuna);
    }
}
