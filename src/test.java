/*
 * massiivid -  näide
 * autor - Anna Karutina
 * ülesanne 5.1
 * */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] vastuvoetud = {2803, 2626, 2359, 1927, 2236, 2281, 2394, 2484, 2468};
        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisesta aasta: ");
        int aasta = sisend.nextInt();
        int massiiviIndeks = aasta - 2011;
        System.out.println("Vastuvõetud on " + vastuvoetud[massiiviIndeks]);

    }
}
