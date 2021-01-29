public class Inimene {
    private String nimi;
    private double pikkus;
    private double mass;

    public Inimene(String nimi) {
        this.nimi = nimi;
        this.pikkus = 0.0;
        this.mass = 0.0;
    }

    public double getPikkus() {
        return pikkus;
    }

    public void setPikkus(double pikkus) {
        this.pikkus = pikkus;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getNimi() {
        return nimi;
    }

    public double kmi() {
        double tulemus = this.mass / Math.pow(this.pikkus, 2);
        return tulemus;
    }

    public void suurendaKaal() {
        this.mass++; // this.mass += 1;
    }

    public void suurendaKaal(double kg) {
        this.mass += kg;
    }

    public void vahendaKaal() {
        this.mass--;
    }

    public void normaalKaal() {
        // kui kmi on 19 - 24.9 - see on norm
        // kui kmi on < 19 - tuleb inimest sööta
        // nii, et ta võtaks 1 kg juurde iga kord
        // ja kontrollida, kas on nüüd asi korras
        // ja juhul, kui kaal on 25 ja suurem
        // siis tuleb pakkuda vähendada kaalu 1 kg võrra
        while (this.kmi() < 19.0) {
            this.suurendaKaal();
        }
        while (this.kmi() >= 25.0) {
            this.vahendaKaal();
        }
        if (this.kmi() >= 19.0 && this.kmi() < 25) {
            System.out.println(this.nimi + ", sinu kaal on normis");
        }
    }


}
