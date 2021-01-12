/*
 * nimekirjad - näide ArrayList kasutamisest
 * autor - Anna Karutina
 * ülesanne 5.3
 * */

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // massiiv faili sisu hoidmiseks
        ArrayList<Double> tehingud = new ArrayList<>();
        // määrame fail ja kontrollime, kas on võiamlik lugeda andmed
        File fail = new File("C:\\Users\\anna\\IdeaProjects\\oop_alused\\src\\konto.txt");
        Scanner sisendFailist = null;
        try {
            sisendFailist = new Scanner(fail);
        } catch (Exception e) {
            System.out.println("Faili pole - " + e.getMessage());
        }
        // loeme failist
        while (sisendFailist.hasNextLine()) {
            Double rida = sisendFailist.nextDouble();
            tehingud.add(rida); // lisame loetud väärtus nimekirja sisse
        }
        sisendFailist.close();
        // vaatame nimekirja sisu
        for (int i = 0; i < tehingud.size(); i++) {
            // väljastame ainult positiivsed
            if (tehingud.get(i) >= 0) {
                System.out.println(tehingud.get(i));
            }
        }
    }
}
