package com.company;

import java.util.Scanner;

public class ArrayBestemmingen {
    public static void main(String[] args) {

        String[] bestemmingen = {"Provence", "Zwitserland", "Bretagne"};


        System.out.println("Kies een bestemming: ");

        for (int i = 0; i < bestemmingen.length ; i++)
            System.out.printf("\t%d. %s\n", (i+1), bestemmingen[i]);


    }
}
