package com.company;

import java.util.Scanner;

public class LoonAantalWerknemers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totaalLoon = 0;
        int aantalWerknemers;


        System.out.print("Geef het aantal werknemers: ");

        aantalWerknemers = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= aantalWerknemers; i++) {

            System.out.print("Geef het loon voor werknemer " + i + ": ");

            double loon = Double.parseDouble(scanner.nextLine());

            totaalLoon = totaalLoon + loon;
        }

        System.out.println("Het totaalloon van de " + aantalWerknemers + " werknemers: " + totaalLoon);
    }
}
