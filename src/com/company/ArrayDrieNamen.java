package com.company;

import java.util.Scanner;

public class ArrayDrieNamen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] namen = new String[3];

        for (int i = 0; i < namen.length; i++) {
            System.out.print("Geef naam " + (i+1) + ": ");
            namen[i] = scanner.nextLine();

        }

        for (int i = namen.length; i > 0 ; i--)
            System.out.println(namen[i-1]);

    }
}
