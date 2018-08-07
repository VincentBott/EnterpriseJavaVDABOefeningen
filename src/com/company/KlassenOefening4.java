package com.company;

import java.util.Scanner;


public class KlassenOefening4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wat was je vorige kilometerstand? ");

        int vorige = Integer.parseInt(scanner.nextLine());

        System.out.print("Wat is je huidige kilometerstand? ");

        int huidige = Integer.parseInt(scanner.nextLine());

        System.out.print("Hoeveel liter heb je getankt? ");

        double liter = Double.parseDouble(scanner.nextLine());

        double verbruik = berekenVerbruik(vorige, huidige, liter);

        System.out.printf("Je verbruik is %.2f l/100km", verbruik);
    }

    private static double berekenVerbruik(int previous, int current, double litre) {

        double resultaat;

        int verschil = current - previous;


        resultaat = litre / verschil *100;


        return resultaat;
    }
}
