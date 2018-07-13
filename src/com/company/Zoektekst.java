package com.company;

import java.util.Scanner;

public class Zoektekst {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String tekst;
        String teZoeken;


        System.out.print("Geef een tekst: ");

        tekst = scanner.nextLine();

        System.out.print("\nGeef een zoektekst: ");

        teZoeken = scanner.nextLine();


        int positie = tekst.indexOf(teZoeken);
        int laatstePositie = tekst.lastIndexOf(teZoeken);

        if (positie != -1){

            if (laatstePositie == positie)
                System.out.println("\n\"" +teZoeken  + "\"" + " komt maar éénmaal voor.");

            if (laatstePositie > positie)
                System.out.println("\nDe zoektekst komt meer dan éénmaal voor. ");

        } else
            System.out.println("\n\"" + teZoeken + "\" komt niet voor.");

    }
}
