package Lagerverwaltung;

public class Main {

    public static void checkLagerverwaltung() {

        System.out.println("Starte checkLagerverwaltung...");

        Lager l1 = new Lager("1", "Hanau");
        Lager l2 = new Lager("2", "Frankfurt");
        Artikel a1 = new Artikel("1", "iPhone", 1299.00, 10);
        Artikel a2 = new Artikel("2", "Wasserflaschen", 19.99, 525);
        Artikel a3 = new Artikel("3", "Tassen", 10.99, 275);
        Artikel a4 = new Artikel("4", "Ladekabel", 5.99, 895);

        l1.hinzufuegenArtikel(a1);
        l1.hinzufuegenArtikel(a4);
        l2.hinzufuegenArtikel(a2);
        l2.hinzufuegenArtikel(a3);

        if (a1.equals(a1.geddMeinLager().holeArtikel(Integer.parseInt(a1.geddArtikelnr())))) {
            System.out.println("a1 ... Check!");
        } else {
            System.err.println("a1 ... Failed!");
        }

        if (a2.equals(a2.geddMeinLager().holeArtikel(Integer.parseInt(a2.geddArtikelnr())))) {
            System.out.println("a2 ... Check!");
        } else {
            System.err.println("a2 ... Failed!");
        }

        if (a3.equals(a3.geddMeinLager().holeArtikel(Integer.parseInt(a3.geddArtikelnr())))) {
            System.out.println("a3 ... Check!");
        } else {
            System.err.println("a3 ... Failed!");
        }

        if (a4.equals(a4.geddMeinLager().holeArtikel(Integer.parseInt(a4.geddArtikelnr())))) {
            System.out.println("a4 ... Check!");
        } else {
            System.err.println("a4 ... Failed!");
        }

        if (l1.equals(l1.holeArtikel(Integer.parseInt(a1.geddArtikelnr())).geddMeinLager()) && l1.equals(l1.holeArtikel(Integer.parseInt(a4.geddArtikelnr())).geddMeinLager())) {
            System.out.println("l1 ... Check!");
        } else {
            System.err.println("l1 ... Failed!");
        }

        if (l2.equals(l2.holeArtikel(Integer.parseInt(a2.geddArtikelnr())).geddMeinLager()) && l2.equals(l2.holeArtikel(Integer.parseInt(a3.geddArtikelnr())).geddMeinLager())) {
            System.out.println("l2 ... Check!");
        } else {
            System.err.println("l2 ... Failed!");
        }

        System.out.println("Ende checkLagerverwaltung!");

    }

    public static void main(String[] args) {

        checkLagerverwaltung();

    }
}
