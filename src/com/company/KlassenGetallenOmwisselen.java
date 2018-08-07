package com.company;


import java.util.Scanner;


public class KlassenGetallenOmwisselen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] getallen = new int[2];

        for (int i = 0; i < getallen.length; i++) {
            System.out.printf("Geef getal %d: ", i+1);
            getallen[i] = Integer.parseInt(scanner.nextLine());
        }

        verwissel(getallen);

        for(int getal: getallen){
            System.out.println(getal);
        }
    }

    private static void verwissel(int[] ingegevenGetallen) {

        int tijdelijkeWaarde0, tijdelijkeWaarde1;  // Maar 1 tijdelijke variabele tmp nodig i.p.v. 2.

        tijdelijkeWaarde0 = ingegevenGetallen[0];
        tijdelijkeWaarde1 = ingegevenGetallen[1];

        ingegevenGetallen[0] = tijdelijkeWaarde1;
        ingegevenGetallen[1] = tijdelijkeWaarde0;

        // Maar 1 extra variabele nodig i.p.v. 2.
    }

}
