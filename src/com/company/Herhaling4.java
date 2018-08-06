package com.company;


import java.util.Random;
import java.util.Scanner;

public class Herhaling4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random rnd = new Random();

        int getal = rnd.nextInt(10) + 1;

        System.out.printf("Een willekeurig getal tussen 1 en 10: %d.\n", getal);

        System.out.print("Wil je nog een getal zien? (ja/nee)");

        String antwoord = scanner.nextLine();

        while ("ja".equalsIgnoreCase(antwoord)){

            getal = rnd.nextInt(10) + 1;

            System.out.printf("Een willekeurig getal tussen 1 en 10: %d.\n", getal);
            System.out.print("Wil je nog een getal zien? (ja/nee)");
            antwoord = scanner.nextLine();
        }

        System.out.println("<Einde programma>");
    }
}
