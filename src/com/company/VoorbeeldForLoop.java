package com.company;

import java.util.Scanner;

public class VoorbeeldForLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Geef naam " + (i+1) + ": ");

            String naam = scanner.nextLine();

            System.out.println();

        }

    }
}
