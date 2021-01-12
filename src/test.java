/*
 * nimekirjad - näide ArrayList kasutamisest
 * autor - Anna Karutina
 * ülesanne 5.4c
 * */

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // massiiv faili sisu hoidmiseks
        ArrayList<String> opilased = new ArrayList<>();
        // määrame fail ja kontrollime, kas on võiamlik lugeda andmed
        File fail = new File("C:\\Users\\anna\\IdeaProjects\\oop_alused\\src\\nimekiri.txt");
        Scanner sisendFailist = null;
        try {
            sisendFailist = new Scanner(fail);
        } catch (Exception e) {
            System.out.println("Faili pole - " + e.getMessage());
        }
        // loeme failist
        while (sisendFailist.hasNextLine()) {
            String rida = sisendFailist.nextLine();
            opilased.add(rida); // lisame loetud väärtus nimekirja sisse
        }
        sisendFailist.close();
        // loome tänase kuupäeva
        LocalDateTime tananeKuupaev = LocalDateTime.now();
        System.out.println("Tänane kuupäev ilma vorminduseta " + tananeKuupaev);
        DateTimeFormatter kuupaevaVormindus = DateTimeFormatter.ofPattern("dd");
        String tananeKuupaevVormindatud = tananeKuupaev.format(kuupaevaVormindus);
        System.out.println("Tänane vormindatud kuupäev " + tananeKuupaevVormindatud);
        // otsime vajalik inimene nimekirjast
        int indeks = Integer.parseInt(tananeKuupaevVormindatud);
        System.out.println(opilased.get(indeks - 1));
        // vaatame nimekirja sisu
        /*
        for (int i = 0; i < opilased.size(); i++) {
            System.out.println(i + " " + opilased.get(i));
        }
        */
    }
}
