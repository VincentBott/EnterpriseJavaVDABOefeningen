package com.company;


import java.util.Scanner;

public class KlassenNaamJoske {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wat is je naam: ");

        String naam = scanner.nextLine();

        String begroeting = maakBegroeting(naam);


        System.out.println(begroeting);
    }

    private static String maakBegroeting(String ingegevenNaam) {

        return  "Dag " + ingegevenNaam;

    }

    /*
    private static String maakBegroeting(String n){
    return String.format("Dag %s%n", n);
    }
     */
}

/*
Wat is je naam: Joske
Dag Joske
 */