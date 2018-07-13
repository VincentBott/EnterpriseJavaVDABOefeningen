package com.company;

import java.util.Scanner;

public class Brutoloon {

    public static void main(String[] args) {

        int uurloon;
        int aantalUren;
        int brutoloon;


        Scanner scanner = new Scanner(System.in);


        System.out.print("Geef uw uurloon: ");

        uurloon = Integer.parseInt(scanner.nextLine());

        System.out.print("Geef het aantal uren op: ");

        aantalUren = Integer.parseInt(scanner.nextLine());


        brutoloon = uurloon * aantalUren;


        System.out.println("Het brutoloon is " + brutoloon + " EUR");
    }
}
