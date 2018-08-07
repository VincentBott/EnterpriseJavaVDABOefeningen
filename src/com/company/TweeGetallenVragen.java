package com.company;

import java.util.Scanner;

public class TweeGetallenVragen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int getal1;

        int getal2;

        System.out.print("Geef eerste getal: ");

        getal1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Geef tweede getal: ");

        getal2 = Integer.parseInt(scanner.nextLine());


  //      int som = getSom(getal1, getal2);


        System.out.printf("%d + %d is %d.\n", getal1, getal2, getSom(getal1, getal2));

        System.out.printf("%d - %d is %d.\n", getal1, getal2, aftrekken(getal1, getal2));

        System.out.printf("%d / %d is %.2f.\n", getal1, getal2, delen(getal1, getal2));

        System.out.printf("%d * %d is %d.\n", getal1, getal2, vermeningvuldigen(getal1, getal2));

    }

    private static int getSom(int getal1, int getal2) {

        return getal1 + getal2;
    }

    private static int aftrekken(int getal1, int getal2) {

        return getal1 - getal2;
    }

    private static double delen(double getal1, double getal2) {

        return  getal1 / getal2;   // Kan ook gecast worden d.m.v. (double)getal1 / getal2
    }

    private static int vermeningvuldigen(int getal1, int getal2) {

        return getal1 * getal2;
    }

}
