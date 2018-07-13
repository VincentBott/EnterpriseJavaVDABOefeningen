package com.company;

import java.util.Scanner;

public class SelectieInEenIteratie {

    public static void main(String[] args) {

        int input;

        Scanner scanner = new Scanner(System.in);

        do {
            int getal1, getal2;
            int resultaat;

            System.out.println("Wilt u:");
            System.out.println("1. Twee getallen optellen.");
            System.out.println("2. Twee getallen aftrekken.");
            System.out.println("0. Stoppen");

            System.out.print("Uw antwoord: ");
            input = Integer.parseInt(scanner.nextLine());

            switch (input) {
                case 1:
                    System.out.print("Geef getal 1: ");
                    getal1 = Integer.parseInt(scanner.nextLine());

                    System.out.print("Geef getal 2: ");
                    getal2 = Integer.parseInt(scanner.nextLine());

                    resultaat = getal1 + getal2;

                    System.out.println(getal1 + " + " + getal2 + " = " + resultaat);

                    break;
                case 2:
                    System.out.print("Geef getal 1: ");
                    getal1 = Integer.parseInt(scanner.nextLine());

                    System.out.print("Geef getal 2: ");
                    getal2 = Integer.parseInt(scanner.nextLine());

                    resultaat = getal1 - getal2;

                    System.out.println(getal1 + " - " + getal2 + " = " + resultaat);

                    break;
                case 0:
                    break;
                default:
                    System.out.println("U moet 1, 2 of 0 ingeven. Kieken !");
            }

        } while (input != 0);

        System.out.println("\nProgramma gestopt.");
    }
}
