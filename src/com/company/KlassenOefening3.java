package com.company;

import java.util.Scanner;


public class KlassenOefening3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wat is de temperatuur? ");

        int graden = Integer.parseInt(scanner.nextLine());


        if(mogenWeNaarHuis(graden))
            System.out.println("Spijtig, we moeten naar huis");
        else
            System.out.println("Joepie, we mogen blijven.");

    }

    private static boolean mogenWeNaarHuis(int grdn) {

    //    boolean returnwaarde      1  returnwaarde op het einde is leesbaarder.

        if (grdn < 10 || grdn > 35)
            return true;
        else
            return false;

    }
}
