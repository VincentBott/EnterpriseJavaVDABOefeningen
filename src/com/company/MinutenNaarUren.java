package com.company;

import java.util.Scanner;

public class MinutenNaarUren {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int aantalUren = 0;


        System.out.print("Wat is het aantal minuten ? ");

        int aantalMinuten = Integer.parseInt(scanner.nextLine());

        while (aantalMinuten >= 60) {

            aantalMinuten = aantalMinuten - 60;
            aantalUren = aantalUren + 1;
            System.out.println("Aantal uren " + aantalUren);
            System.out.println("Aantal minuten " + aantalMinuten);
        }


        System.out.println("Het aantal uren is " + aantalUren + " en het aantal minuten is " + aantalMinuten);
    }
}
