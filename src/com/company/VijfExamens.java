package com.company;

import java.util.Scanner;

public class VijfExamens {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double totaal = 0;
    double gemiddelde;

        for (int i = 1; i <= 5 ; i++) {

            System.out.print("Geef punten voor examen " + i + ": ");

            int punt = Integer.parseInt(scanner.nextLine());

            totaal = totaal + punt;
        }

        gemiddelde = totaal / 5;

        System.out.println("Het totaal" + " = " + totaal);
        System.out.println("Het gemiddelde" + " = " + gemiddelde);
    }
}
