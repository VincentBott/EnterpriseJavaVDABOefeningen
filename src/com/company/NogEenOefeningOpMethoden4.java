package com.company;

import java.util.Scanner;

/*
Geef een getal tussen -5 en 5: 10
Fout, kieken
Geef een getal tussen -5 en 5: -10
Fout, kieken
Geef een getal tussen -5 en 5: 0
Het getal is 0.
 */
public class NogEenOefeningOpMethoden4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int MINIMUM= -5;
        final int MAXIMUM = 5;

        int getal = vraagGetal(scanner, MINIMUM, MAXIMUM);

        System.out.printf("Het getal is %d." , getal);

    }


        private static int vraagGetal(Scanner scanner, int minimum, int maximum) {

        int getal;

        do {

            System.out.printf("Geef een getal tussen %d en %d: ", minimum, maximum);

            getal = Integer.parseInt(scanner.nextLine());

            if (getal <= minimum || getal >= maximum)
                System.out.print("Fout, kieken.\n");


        } while (getal <= -5 || getal >= 5);


        return getal;
        }

}
