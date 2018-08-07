package com.company;

import java.util.Scanner;

public class KlassenOefening1 {

    public static void main(String[] args) {
        char gender = 'm';

        String naam = "Joske";

        String begroeting = begroet(gender, naam);

        System.out.println(begroeting);

        gender = 'v';

        naam = "Marieke";

        begroeting = begroet(gender, naam);

        System.out.println(begroeting);

    }

    private static String begroet(char g, String name) {

        String aanspreektitel;

        if (g == 'm')
            aanspreektitel = "meneer";
        else
            aanspreektitel = "mevrouw";


        return String.format("Dag %s %s.", aanspreektitel, name);

    }
}
