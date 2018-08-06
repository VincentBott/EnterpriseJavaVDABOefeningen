package com.company;

import java.util.Scanner;

public class Herhaling3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een getal tussen 1 en 10: ");

        int getal = Integer.parseInt(scanner.nextLine());

        while (getal < 1 || getal > 10) {

            System.out.print("Kieken. Ik zei tussen 1 en 10. Opnieuw: ");
            getal = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Prima");
    }
}