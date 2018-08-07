package com.company;

import java.util.Scanner;


public class NogEenOefeningOpMethoden2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double nettoprijs;

        double eindprijs;

        String productnaam;

        System.out.print("Geef productnaam: ");

        productnaam = scanner.nextLine();

        System.out.print("Geef nettoprijs: ");

        nettoprijs = Double.parseDouble(scanner.nextLine());


        eindprijs = berekenPrijs(nettoprijs, productnaam);

        System.out.printf("%s kost %.2f EURO (incl. BTW)", productnaam, eindprijs);
    }


    private static double berekenPrijs(double nettoprijs, String productnaam) {

        double percentage;

        double resultaat;

        if ( productnaam.charAt(productnaam.length() - 1) == 't')
            percentage = 1.21;
        else
            percentage = 1.06;

        resultaat = nettoprijs * percentage;

        return resultaat;
    }
}
