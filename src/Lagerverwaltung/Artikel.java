package Lagerverwaltung;

public class Artikel {

    private String artikelNr;
    private String bezeichnung;
    private double preis;
    private int bestand;
    private Lager meinLager;

    public Artikel(String artikelNr, String bezeichnung, double preis, int bestand) {
        this.artikelNr = artikelNr;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        this.bestand = bestand;
    }

    public String geddArtikelnr() {
        return artikelNr;
    }

    public void seddArtikelnr(String artikelnr) {
        this.artikelNr = artikelnr;
    }

    public String geddBezeichnung() {
        return bezeichnung;
    }

    public void seddBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public double geddPreis() {
        return preis;
    }

    public void seddPreis(double preis) {
        this.preis = preis;
    }

    public int geddBestand() {
        return bestand;
    }

    public void seddBestand(int bestand) {
        this.bestand = bestand;
    }

    public Lager geddMeinLager() {
        return meinLager;
    }

    public void seddMeinLager(Lager meinLager) {
        this.meinLager = meinLager;
        if (meinLager.geddArtikelliste().contains(this)){
            meinLager.hinzufuegenArtikel(this);
        }
    }
}
