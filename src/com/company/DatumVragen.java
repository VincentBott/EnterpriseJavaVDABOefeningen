package com.company;

import java.util.Scanner;

import java.time.LocalDate;


public class DatumVragen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LocalDate huidigeDatum = LocalDate.now();
        LocalDate ingevoerdeDatum;

        int dag;
        int maand;
        int jaar;


        do {

            System.out.println("Geef een datum die in de toekomst moet liggen.\n");
            System.out.print("Geef een jaar: ");

            jaar = Integer.parseInt(scanner.nextLine());


            System.out.print("Geef een maand: ");

            maand = Integer.parseInt(scanner.nextLine());

            System.out.print("Geef een dag: ");

            dag = Integer.parseInt(scanner.nextLine());

            ingevoerdeDatum = LocalDate.of(jaar, maand, dag);


        } while ( ingevoerdeDatum.isBefore(huidigeDatum));


        System.out.println("De datum is " + dag + "/" + maand + "/" + jaar);
    }
}
