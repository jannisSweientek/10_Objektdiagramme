package Lagerverwaltung;

import java.util.ArrayList;

public class Lager {

    private String lagerNr;
    private String bezeichnung;
    private final ArrayList<Artikel> artikelliste;

    private Lager() {
        artikelliste = new ArrayList<>();
    }

    public Lager(String lagerNr, String bezeichnung) {
        this();
        this.lagerNr = lagerNr;
        this.bezeichnung = bezeichnung;
    }

    public String geddLagerNr() {
        return lagerNr;
    }

    public void seddLagerNr(String lagerNr) {
        this.lagerNr = lagerNr;
    }

    public String geddBezeichnung() {
        return bezeichnung;
    }

    public void hinzufuegenArtikel(Artikel a) {
        a.seddMeinLager(this);
        if (this.geddArtikelliste().contains(a)){
            this.artikelliste.add(a);
        }
    }

    public Artikel holeArtikel(int nr) {
        for (Artikel a : this.artikelliste) {
            if (Integer.parseInt(a.geddArtikelnr()) == nr) {
                return a;
            }
        }
        System.err.println("Es wurde kein Artikel mit der Art.Nr." + nr + " gefunden!");
        return null;
    }

    public int holeAnzahl() {
        int temp = 0;
        for (Artikel a : this.artikelliste) {
            temp += a.geddBestand();
        }
        return temp;
    }

    public ArrayList<Artikel> geddArtikelliste() {
        return artikelliste;
    }
}
