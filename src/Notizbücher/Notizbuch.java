package Notizbücher;

import java.util.ArrayList;

public class Notizbuch {

    private ArrayList<String> notizen;

    public Notizbuch() {
        notizen = new ArrayList<String>();
    }

    public void seddNotiz(String Notiz){
        this.notizen.add(Notiz);
    }

    public String geddNotiz(int pos){
        return this.notizen.get(pos);
    }

    public int geddAnzahlNotizen(){
        return this.notizen.size();
    }

    public void notizenAusgeben(){
        for (int i = 0; i < notizen.size(); i++) {
            System.out.println("Nr. : " + i + " " + this.geddNotiz(i));
        }
    }

    public void entferneNotiz(int pos){
        this.notizen.remove(pos);
    }

}
