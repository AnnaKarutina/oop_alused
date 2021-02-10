public class Test {
    public static void main(String[] args) {
        Sein seinPohi = new Sein("põhi sein");
        Sein seinLouna = new Sein("lõuna sein");
        Sein seinLaane = new Sein("lääne sein");
        Sein seinIda = new Sein("ida sein");

        Lagi lagi = new Lagi(2.5, "helesinine");

        Voodi voodi = new Voodi("kahele", 2, 2, 1, 70);

        Lamp lamp = new Lamp("Klassikaline", false);

        Magamistuba magamistuba = new Magamistuba("külaliste magamistuba", seinPohi, seinLouna, seinLaane, seinLouna, lagi, voodi, lamp);
        magamistuba.valmistaVoodi();
        magamistuba.valmistaLamp();
        System.out.println(magamistuba.getLamp().isSisseLulitatud());
    }
}
