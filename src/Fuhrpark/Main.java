package Fuhrpark;

public class Main {

    public static void main(String[] args) {

        Mitarbeiter ma1 = new Mitarbeiter("Müller");
        Dienstwagen dw1 = new Dienstwagen("S - A 4711");

        ma1.seddSeinDienstwagen(dw1);

        System.out.println(ma1.geddSeinDienstwagen().geddKennzeichen());

        System.out.println(dw1.geddNameFahrer());

    }

}
