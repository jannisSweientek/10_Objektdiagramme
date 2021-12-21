package Notizbücher;

public class Main {

    public static void main(String[] args) {

        Notizbuch note1 = new Notizbuch();

        note1.seddNotiz("Milch kaufen");
        note1.seddNotiz("Oma anrufen");
        note1.seddNotiz("Fahrkarte kaufen");
        note1.seddNotiz("Kinoprogramm ?");

        note1.notizenAusgeben();

    }

}
