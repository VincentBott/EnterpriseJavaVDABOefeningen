package com.company;

import java.util.Scanner;

public class BrutoloonMetOveruren {


    static final double URENPERDAG = 7.6;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double urenGewerkt;
        double brutoloon;
        double overuren;
        double uurloon;
        double urenAanNormaalLoon;


        System.out.print("Geef het aantal gewerkte uren op: ");

        urenGewerkt = Integer.parseInt(scanner.nextLine());

        System.out.print("Geef het uurloon: ");

        uurloon = Integer.parseInt(scanner.nextLine());


        if (urenGewerkt > URENPERDAG) {

            overuren = urenGewerkt - URENPERDAG;
            urenAanNormaalLoon = URENPERDAG;

        } else {
            overuren = 0;
            urenAanNormaalLoon = urenGewerkt;
        }

        brutoloon = (urenAanNormaalLoon * uurloon) + (overuren * uurloon * 1.5);

        System.out.println("Uw brutoloon: " + brutoloon);
    }
}
