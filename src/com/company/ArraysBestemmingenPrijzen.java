package com.company;

import java.util.Scanner;

public class ArraysBestemmingenPrijzen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] bestemmingen = {"Provence", "Zwitserland", "Bretagne"};

        System.out.print("Geef je naam: ");

        String naam = scanner.nextLine();

        Double[] prijzen = {200.00, 350.00, 250.00};

        int keuze;


        do {
            System.out.println("Kies een bestemming: ");

            for (int i = 0; i < bestemmingen.length; i++) {
                System.out.printf("\t%d. %s (€%.2f)\n", (i + 1), bestemmingen[i], prijzen[i]);

            }

            System.out.print("Welke bestemming kies je (1-3) ? ");

            keuze = Integer.parseInt(scanner.nextLine());

            if (keuze < 1 || keuze > 3)
                System.out.println("Kies een geldig nummer.");


        } while (keuze < 1 || keuze > 3);

        System.out.printf("Dag %s, goede reis naar %s. Dit kost je € %.2f" , naam, bestemmingen[keuze-1], prijzen[keuze-1]);

    }
}
