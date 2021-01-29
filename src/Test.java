public class Test {
    public static void main(String[] args) {
        Inimene mati = new Inimene("Mati");
        mati.setPikkus(1.80);
        mati.setMass(149.0);
        System.out.println(mati.getNimi() + " on " + mati.getPikkus() + "m pikk ja kaalub " + mati.getMass() + " kg");
        System.out.println("kmi = " + mati.kmi());
        System.out.printf("kmi = %.2f\n", mati.kmi());

        mati.suurendaKaal();
        System.out.println(mati.getNimi() + " on " + mati.getPikkus() + "m pikk ja kaalub " + mati.getMass() + " kg");

        mati.suurendaKaal(5.0);
        System.out.println(mati.getNimi() + " on " + mati.getPikkus() + "m pikk ja kaalub " + mati.getMass() + " kg");
        System.out.printf("kmi = %.2f\n", mati.kmi());

        mati.normaalKaal();
        System.out.println(mati.getNimi() + " on " + mati.getPikkus() + "m pikk ja kaalub " + mati.getMass() + " kg");
        System.out.printf("kmi = %.2f\n", mati.kmi());
    }
}
