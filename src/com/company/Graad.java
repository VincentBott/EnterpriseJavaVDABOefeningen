package com.company;

import java.util.Scanner;

public class Graad {

    public static void main(String[] args) {


        System.out.print("Geef uw resultaat in: ");

        Scanner scanner = new Scanner(System.in);

        int punt = Integer.parseInt(scanner.nextLine());


        if (punt > 20) {
            System.out.println("U kan maximaal 20/20 hebben !");
        }
        else if (punt >= 18) {
            System.out.println("Grootste onderscheiding");

        } else if (punt >= 16 && punt < 18) {

            System.out.println("Grote onderscheiding");

        } else if (punt >= 14 && punt < 16) {
            System.out.println("Onderscheiding)");

        } else if (punt >= 10 && punt < 14) {
            System.out.println("Voldoende");

        } else if (punt < 10 && punt >= 0) {
            System.out.println("Onvoldoende");

        } else {
            System.out.println("U kan geen negatieve score invoeren !");
        }

    }
}

