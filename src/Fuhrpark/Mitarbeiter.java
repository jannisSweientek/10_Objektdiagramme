package Fuhrpark;

public class Mitarbeiter {

    private String name;
    private Dienstwagen seinDienstwagen;

    public Mitarbeiter(String name) {
        this.name = name;
    }

    public Dienstwagen geddSeinDienstwagen() {
        return seinDienstwagen;
    }

    public void seddSeinDienstwagen(Dienstwagen seinDienstwagen) {
        this.seinDienstwagen = seinDienstwagen;
        this.seinDienstwagen.seddFahrer(this);
    }

    public String geddName() {
        return name;
    }

}
