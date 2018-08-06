package com.company;

import java.util.Scanner;

public class Herhaling8 {

    public static void main(String[] args) {

        String[] namen = {"Karen", "Kristel", "Kathleen", "Josje", "Hanne", "Marthe", "Klaasje"};

        int aantalK = 0;
        int aantalJ = 0;
        int aantalAnder = 0;

        for (int i = 0; i < namen.length; i++) {

            String naam = namen[i];


            switch(naam.charAt(0)) {
                case 'K':
                    aantalK++;
                    break;
                case 'J':
                    aantalJ++;
                    break;
                default:
                    aantalAnder++;
            }
        }
        System.out.printf("Er zijn %d namen met een 'K', %d met een 'J' en %d andere", aantalK, aantalJ, aantalAnder);
    }
}
