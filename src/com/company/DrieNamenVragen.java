package com.company;

import java.util.Scanner;

public class DrieNamenVragen {

    public static void main(String[] args) {

        /*
        Geef naam: Karen
        Naam:      Karen
        Geef naam: Kristel
        Naam:    Kristel
        Geef naam: Kathleen
        Naam:   Kathleen
        */

        Scanner scanner = new Scanner(System.in);

        String naam;

        // Dit moet gepushed worden op Github.

        for (int i = 0; i <  3; i++) {
            System.out.print("Geef naam: ");

            naam = scanner.nextLine();

            System.out.println(String.format("Naam: %10s", naam));

            System.out.printf("Naam: %10s\n", naam);  // souf of printf voegt niet automatisch een newline \n toe. Print/souf is ineens met String.format.
        }
    }
}
