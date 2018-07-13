package com.company;

import java.util.Scanner;


public class KommagetallenOpmaken {

    public static void main(String[] args) {

        /*
        Geef eerste getal: 10
        Geef tweede getal: 6
        10 / 6 =  1,67
         */

        Scanner scanner = new Scanner(System.in);

        double eersteGetal;
        double tweedeGetal;
        double resultaat;

        System.out.print("Geef eerste getal: ");

        eersteGetal = Double.parseDouble(scanner.nextLine());

        System.out.print("Geef tweede getal: ");
        tweedeGetal = Double.parseDouble(scanner.nextLine());

        resultaat = eersteGetal / tweedeGetal;


        System.out.println(String.format("\n%.0f / %.0f = %.2f", eersteGetal, tweedeGetal, resultaat));
    }
}
