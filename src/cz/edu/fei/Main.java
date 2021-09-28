package cz.edu.fei;

import java.util.Scanner;

public class Main {
    static final double PI = 3.14;

    public static void main(String[] args) {
        //Převod galonů na litrů
        System.out.println("-- převod galonů na litry --");
        int galon = 20;
        double litr = 3.7854;
        double prevod = galon * litr;
        System.out.println("převedeno = " + prevod);

        //Gravitace
        System.out.println("-- Výpočet gravitace na měsíci --");
        double vaha = 70;
        double vahaMesic = vaha/100 * 17;
        System.out.println("Moje váha na měsíci = " + vahaMesic);

        //Obsah a obvod
        System.out.println("-- obvod kruhu --");
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadejte poloměr kruhu");
        double polomerKruhu = vstup.nextDouble();
        double obvodKruhu = 2 * PI * polomerKruhu;
        System.out.println("obvod kruhu : " + obvodKruhu);

        System.out.println("-- obsah kruhu --");
        Scanner vstupDva = new Scanner(System.in);
        System.out.println("Zadejte poloměr kruhu ");
        double polomerKruhuDva = vstupDva.nextDouble();
        double obsahKruhu = PI * polomerKruhuDva *polomerKruhuDva;
        System.out.println("Obsah Kruhu " + obsahKruhu);



    }
}