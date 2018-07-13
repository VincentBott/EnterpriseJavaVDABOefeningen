package com.company;

import java.util.Scanner;

public class VierkantTekenen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int zijdeLengte;

        System.out.print("Geef zijde: ");

        zijdeLengte = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < zijdeLengte; i++) {
            for (int j = 0; j < zijdeLengte; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
