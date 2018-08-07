package com.company;

import java.util.Scanner;

/*
Geef tekst: plop
plop is geen palindroom
 */

public class NogEenOefeningOpMethoden3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef tekst: ");

        String tekst = scanner.nextLine();

        if (isPalindroom(tekst)){

            System.out.printf("%s is een palindroom", tekst);

        }else{
            System.out.printf("%s is geen palindroom", tekst);

        }
    }

    private static boolean isPalindroom(String ingegevenWoord) {

        String anderwoord = "";

        for(int i = ingegevenWoord.length() -1; i>= 0; i--)
            anderwoord = anderwoord + ingegevenWoord.charAt(i);



        if (ingegevenWoord.equalsIgnoreCase(anderwoord))
            return true;
        else
            return false;
    }
}
