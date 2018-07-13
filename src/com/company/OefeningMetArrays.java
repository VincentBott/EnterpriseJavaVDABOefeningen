package com.company;

import java.util.Scanner;

public class OefeningMetArrays {
    public static void main(String[] args) {
        
        String[] namen = {"Joske", "Louiske", "Franske", "Jefke"};

        for (int i = 1; i <= namen.length ; i++) {
            System.out.println("Naam " + i + ": " + namen[i-1]);
        }

        System.out.println();

        for (String naam: namen) {
            System.out.println(naam);
        }
    }
}
