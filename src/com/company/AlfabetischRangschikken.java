package com.company;

import java.util.Scanner;

public class AlfabetischRangschikken {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String woord1;
        String woord2 = "";

        boolean komtNa = false;

        System.out.print("Geef een woord: ");

        woord1 = scanner.nextLine();


        while (komtNa == false) {    // Kan ook met een do while

            System.out.print("Geef een woord dat alfabetisch  na dit woord komt: ");

            woord2 = scanner.nextLine();

            if (woord1.compareTo(woord2) > 0) {

                System.out.println("\"" + woord2 + "\"" + " komt niet na " + "\"" + woord1 + "\"");

            } else if (woord1.compareTo(woord2)  == 0) {

                System.out.println("\"" + woord2 + "\"" + " komt niet na " + "\"" + woord1 + "\"");

            } else
                komtNa = true;
        }
        System.out.println("Inderdaad, " + "\"" + woord2 + "\"" + " komt na " + "\"" + woord1 + "\"");
    }
}
