package com.company;

import java.util.Scanner;

public class StringVragen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lengteTekst;
        int pogingen = 0;

        String ingegevenTekst;

        System.out.print("Geef een tekst van minstens 8 karakters: ");

        do {

            ingegevenTekst= scanner.nextLine();
            lengteTekst = ingegevenTekst.length();

            if (lengteTekst < 8) {
                pogingen++;
                System.out.print("Kieken, ik zei minstens 8. Opnieuw: ");
            }

        } while (lengteTekst < 8);

        if (pogingen > 0)
            System.out.println("Eindelijk !");

        System.out.println("Je tekst is \"" + ingegevenTekst + "\"");
    }
}
