package Fuhrpark;

public class Dienstwagen {

    private String kennzeichen;
    private Mitarbeiter fahrer;

    public Dienstwagen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String geddKennzeichen() {
        return kennzeichen;
    }

    public String geddNameFahrer() {
        return fahrer.geddName();
    }

    public void seddFahrer(Mitarbeiter fahrer) {
        this.fahrer = fahrer;
    }
}
