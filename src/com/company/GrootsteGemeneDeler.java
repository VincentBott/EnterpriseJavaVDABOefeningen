package com.company;

import java.util.Scanner;

public class GrootsteGemeneDeler {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int getal1, getal2, grootsteGemeneDeler;


        System.out.print("Geef het eerste getal: ");

        getal1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Geef het tweede getal: ");

        getal2 = Integer.parseInt(scanner.nextLine());

        while (getal1 != getal2) {
            if (getal1 > getal2) {
                getal1 = getal1 - getal2;
            } else {
                getal2 = getal2 - getal1;
            }
        }

        grootsteGemeneDeler = getal1;

        System.out.println("De grootste gemene deler is " + grootsteGemeneDeler);

    }
}
