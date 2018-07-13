package com.company;

import java.util.Scanner;

public class Palindroom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String ingegevenWoord;

        System.out.print("Geef een woord: ");

        ingegevenWoord = scanner.nextLine();

    //  char[] woordArray = ingegevenWoord.toCharArray();

        String anderwoord = "";


    //  char[] omgekeerdWoordArray = ingegevenWoord.toCharArray();

        int lengteWoord = ingegevenWoord.length();


    /*  for (int i = 0; i < lengteWoord; i++
        //
        //         omgekeerdWoordArray[i] = ingegevenWoord.charAt(i);
           }

    */

        for(int i = ingegevenWoord.length() -1; i>= 0; i--)
               anderwoord = anderwoord + ingegevenWoord.charAt(i);


   //     omgekeerdWoord = new String (omgekeerdWoordArray);


        if (ingegevenWoord.equalsIgnoreCase(anderwoord))
            System.out.println(ingegevenWoord + " is een palindroom.");
        else
            System.out.println(ingegevenWoord + " is geen palindroom");



        System.out.println(ingegevenWoord);
        System.out.println(anderwoord);


    }
}
