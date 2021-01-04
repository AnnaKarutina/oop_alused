/*
 * muutujad ja andmetüübid -  näide
 * autor - Anna Karutina
 * ülesanne 2.3c
 * */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Inimeste arv: ");
        // salvestame kasutaja sisestatud väärtus
        int inimesed = sisend.nextInt();
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Kohtade arv: ");
        // salvestame kasutaja sisestatud väärtus
        int kohad = sisend.nextInt();
        // arvutamine
        // kuna nii inimesed kui ka kohad on täiearvud
        // siis / operaator töötab sama moodi nagu // pythonis
        int bussid = inimesed / kohad;
        // % - jäägi leidmine
        int viimasesBussis = inimesed % kohad;
        // väljastame
        if (viimasesBussis > 0) {
            bussid++; // suurendame busside arv ühe võrra, ++ on sama, mis bussid += 1
        } else {
            // kui ei ole inimesi, kellele on vaja lisabuss tellida,
            // siis vaatame, mitu inimest on viimases bussis
            // need on sama palju, nagu kohti bussis, mis sai eelnevalt täidetud
            viimasesBussis = kohad;
        }
        System.out.println("Busse vaja: " + bussid);
        System.out.println("Viimases bussis inimesi: " + viimasesBussis);
    }
}
