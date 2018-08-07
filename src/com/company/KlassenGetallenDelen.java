package com.company;

import java.util.Scanner;


public class KlassenGetallenDelen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef eerste getal: ");

        int getal1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Geef tweede getal: ");

        int getal2 = Integer.parseInt(scanner.nextLine());

        double resultaat = delen(getal1, getal2);

        System.out.printf("Het resultaat is %.2f", resultaat);
    }


    private static double delen(int get1, int get2) {

        double result;

        if (get1 > get2 )
            result = (double)get1 / get2;
        else if (get2 > get1)
            result = (double)get2 / get1;
        else
            result = 1;

        return result;
    }
}
