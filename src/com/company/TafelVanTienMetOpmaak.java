package com.company;

import java.util.Scanner;

public class TafelVanTienMetOpmaak {

    public static void main(String[] args) {

        String uitgelijndeTekst;


        for (int i = 1; i <= 10; i++) {

            uitgelijndeTekst = String.format("%2$d x 10 = %3$d", i, i*10);  //  $ is om variabelen op te wisselen in de output !
            System.out.println(uitgelijndeTekst);

        }
    }
}


