package com.company;

import java.util.Scanner;

public class Palindroom {
    public static void main(String[] args) {

        /*
        Geef een woord:lepel
        lepel is een palindroom.
         */

        Scanner scanner = new Scanner(System.in);

        String ingegevenWoord;

        System.out.println("Geef een woord: ");

        ingegevenWoord = scanner.nextLine();

    //    char[] woordArray = ingegevenWoord.toCharArray();

        String omgekeerdWoord = "";
        char[] omgekeerdWoordArray = ingegevenWoord.toCharArray();

        int lengteWoord = ingegevenWoord.length();

        for (int i = 0; i < lengteWoord; i++) {
            omgekeerdWoordArray[i] = ingegevenWoord.charAt(i);
        }

        omgekeerdWoord = new String (omgekeerdWoordArray);

        if (ingegevenWoord.equalsIgnoreCase(omgekeerdWoord))
            System.out.println(ingegevenWoord + " is een palindroom.");
        else
         System.out.println(ingegevenWoord + " is geen palindroom");


        System.out.println(ingegevenWoord);
        System.out.println(omgekeerdWoord);



    }
}
