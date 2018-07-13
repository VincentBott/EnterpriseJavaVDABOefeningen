package com.company;

import java.util.Scanner;


public class GetalVragen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int getal;

        System.out.println("Geef een getal groter dan 0 in: ");
        getal = Integer.parseInt(scanner.nextLine());

        while (getal <= 0) {

            //      if (getal <= 0) {

                System.out.println("Een getal groter dan 0 aub. Geen een nieuw getal in: ");
                getal = Integer.parseInt(scanner.nextLine());

                //          }
        }
        System.out.println("Uw ingegeven getal is " + getal);
    }
}
