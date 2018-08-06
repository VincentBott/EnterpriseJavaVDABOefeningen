package com.company;

import java.util.Random;
import java.util.Scanner;


class Herhaling10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random rnd = new Random();

        int tezoeken = rnd.nextInt(10) + 1;

        boolean gevonden = false;

        int aantalPogingen = 0;

        do{

        System.out.print("Raad een getal tussen 1 en 10: " );

        int invoer = Integer.parseInt(scanner.nextLine());

        aantalPogingen++;

        if (tezoeken != invoer) {

            if (tezoeken > invoer)
                System.out.println("Het getal is groter.\n");
            else
                System.out.println("Het getal is kleiner.\n");
        } else
            gevonden = true;


        }  while(!gevonden);


        System.out.printf("Je vond het getal in %d pogingen.", aantalPogingen);
    }
}
