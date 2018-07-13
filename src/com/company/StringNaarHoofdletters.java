package com.company;

import java.util.Scanner;

public class StringNaarHoofdletters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Geef je naam: ");

        String naam = scanner.nextLine();

        String inHoofdletters;

        inHoofdletters = naam.toUpperCase();


        System.out.println("\nJe naam: " + inHoofdletters);
    }
}
