package com.company;

import java.util.Scanner;
import java.util.Random;


public class RandomGetalRaden {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random rnd = new Random();

        int getal = rnd.nextInt(100) + 1;

        int ingevoerdeGetal;
        int teller = 0;


        do  {

            System.out.print("Raad een getal tussen 1 en 100: ");

            ingevoerdeGetal = Integer.parseInt(scanner.nextLine());

            if (ingevoerdeGetal < getal)
                System.out.println("HOGER");
            if (ingevoerdeGetal > getal)
                System.out.println("LAGER");

            teller++;

        } while (getal != ingevoerdeGetal);

        System.out.println("Het getal was " + getal + " en is gevonden in " + teller + " beurten.");
    }
}
