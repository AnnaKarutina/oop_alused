/*
 * konto halduse programm
 * */


public class Test {
    public static void main(String[] args) {
        // loo Konto tüüpi objekt nimega annaKonto
        Konto annaKontoSEB = new Konto();
        Konto annaKontoSWED = new Konto();
        // lisan konkreetsed väärtused
        annaKontoSEB.looKonto("Anna", 0.0);
        annaKontoSWED.looKonto("Anna", 0.0);

        annaKontoSEB.lisaRaha(20.0);
        annaKontoSWED.lisaRaha(-50.0);
        // väljastame tulemused
        System.out.println("SEB");
        System.out.println("Konto omanik = " + annaKontoSEB.omanik);
        System.out.println("Konto bilans = " + annaKontoSEB.bilans);
        annaKontoSEB.votaRaha(10.0);
        System.out.println("Konto bilans = " + annaKontoSEB.bilans);
        annaKontoSEB.votaRaha(20.0);
        System.out.println("Konto bilans = " + annaKontoSEB.bilans);
        annaKontoSEB.teeYlekanne(annaKontoSWED, 10.0);
        System.out.println("Konto bilans = " + annaKontoSEB.bilans);
        annaKontoSEB.teeYlekanne(annaKontoSWED, 10.0);
        System.out.println("Konto bilans = " + annaKontoSEB.bilans);
        System.out.println();
        System.out.println("SWED");
        System.out.println("Konto omanik = " + annaKontoSWED.omanik);
        System.out.println("Konto bilans = " + annaKontoSWED.bilans);
    }
}
