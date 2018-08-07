package com.company;

import java.util.Scanner;

public class KlassenOefening2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef temperatuur in Celsius: ");

        int inCelsius = Integer.parseInt(scanner.nextLine());

        double inFahrenheit = naarFahrenheit(inCelsius);

        System.out.printf("%d °C is %.2f °F", inCelsius, inFahrenheit);

    }

    private static double naarFahrenheit(int inCelc) {

        return (double)inCelc  * 9 / 5 + 32;
    }
}
