package com.company;

import java.util.Scanner;

public class GetalInvoerenForLoop {

    public static void main(String[] args) {

        int getal;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een getal: ");

        getal = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {

            int product = getal * i;

            System.out.println(getal + " x " + i + " = " + product);
        }

    }
}


