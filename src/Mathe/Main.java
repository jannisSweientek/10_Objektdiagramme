package Mathe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double base = 0.0;
        int length = 0;
        double steps = 0.0;
        double start = 0.0;


        System.out.println("Bitte geben sie die Exponential-Funktion ein:");
        System.out.println("f(x) = a^x");
        System.out.print("a = ");
        base = scan.nextDouble();
        System.out.println("\nBitte den Beginn der tabelle eingeben");
        start = scan.nextDouble();
        System.out.println("\nBitte die länge der tabelle eingeben");
        length = scan.nextInt();
        System.out.println("\nBitte geben sie die Schrittlänge an");
        steps = scan.nextDouble();
        System.out.println("\t");

        double [] xArray = new double[length];
        for (int i = 0; i < length; i++) {
            xArray[i] = i * steps + start;
        }
        double [] yArray = new double[length];
        for (int i = 0; i < length; i++) {
            yArray[i] = Math.pow(base, xArray[i]);
        }

        arrayAuswerten(xArray, yArray);

    }

    public static void arrayAuswerten(double [] xA, double [] yA){


        int tabnum1=0;
        int tabnum2=0;
        int tabnum1max=0;
        int tabnum2max=0;
        String temp="";
        String trennstrich="";
        for (int i = 0; i < xA.length; i++) {
            tabnum1=Double.toString(xA[i]).length();
            if(tabnum1max<tabnum1){
                tabnum1max=tabnum1;
            }
            tabnum2=Double.toString(yA[i]).length();
            if(tabnum2max<tabnum2){
                tabnum2max=tabnum2;
            }
        }

        temp="";
        temp+=(yA[1]/yA[0]);

        trennstrich="|><|---";
        for (int j=0;j<tabnum1max+2;j++){
            trennstrich+="-";
        }
        trennstrich+="|<>|";
        for (int j=0;j<3;j++){
            trennstrich+="-";
        }
        for (int j=0;j<tabnum2max+2;j++){
            trennstrich+="-";
        }
        trennstrich+="|<>|";
        for (int j=0;j<12-temp.length();j++){
            trennstrich+="-";
        }
        trennstrich+="|><|";
        System.out.println(trennstrich);

        tabnum1=Double.toString(xA[0]).length();
        tabnum2=Double.toString(yA[0]).length();
        int a=tabnum1max/2;
        int b=tabnum2max/2;
        if(tabnum1max%2!=0)a++;
        if (tabnum2max%2!=0)b++;
        String tabline="|><|";
        for (int i=0;i<a+2;i++){
            tabline+=" ";
        }
        tabline+="x";
        for (int i=0;i<a+1;i++){
            tabline+=" ";
        }
        tabline+="|<>|";
        for (int i=0;i<b+2;i++){
            tabline+=" ";
        }
        tabline+="f(x)";
        for (int i=0;i<b-1;i++){
            tabline+=" ";
        }
        tabline+="|<>|    a";
        System.out.println(tabline);
        System.out.println(trennstrich);

        tabline="|><|   ";
        tabline+=xA[0];
        for (int j=0;j<(tabnum1max-tabnum1)+2;j++){
            tabline+=" ";
        }
        tabline+="|<>|";
        for (int j=0;j<3;j++){
            tabline+=" ";
        }
        tabline+=yA[0];
        for (int j=0;j<(tabnum2max-tabnum2)+2;j++){
            tabline+=" ";
        }
        tabline+="|<>|";
        for (int j=0;j<3;j++){
            tabline+=" ";
        }
        tabline+="NA";
        System.out.println(tabline);

        System.out.println(trennstrich);
        for (int i = 1; i < xA.length; i++) {
            tabnum1=Double.toString(xA[i]).length();
            tabnum2=Double.toString(yA[i]).length();
            tabline="|><|   ";
            tabline+=xA[i];
            for (int j=0;j<(tabnum1max-tabnum1)+2;j++){
                tabline+=" ";
            }
            tabline+="|<>|";
            for (int j=0;j<3;j++){
                tabline+=" ";
            }
            tabline+=yA[i];
            for (int j=0;j<(tabnum2max-tabnum2)+2;j++){
                tabline+=" ";
            }
            tabline+="|<>|";
            for (int j=0;j<3;j++){
                tabline+=" ";
            }
            tabline+=yA[i]/yA[i-1];
            tabline+="   |><|";
            System.out.println(tabline);
            System.out.println(trennstrich);
        }
    }

}
