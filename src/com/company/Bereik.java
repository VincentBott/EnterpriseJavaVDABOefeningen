package com.company;


import java.util.Scanner;

public class Bereik {

    public static void main(String[] args) {

        System.out.print("Geef nummer van dag: ");

        Scanner scanner = new Scanner(System.in);

        int dagNummer = Integer.parseInt(scanner.nextLine());

        if (dagNummer >= 1 && dagNummer <= 5) {
            System.out.println("Dit is een weekdag");
        } else if (dagNummer == 6 || dagNummer == 7) {
            System.out.println("Dit is weekend");
        } else {
            System.out.println("Dit is een ongeldige dag");
        }
    }

}
