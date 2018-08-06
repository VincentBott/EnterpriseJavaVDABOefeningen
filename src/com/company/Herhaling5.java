package com.company;


import java.util.Arrays;

import java.util.Scanner;

public class Herhaling5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] getallen = new int[3];

        for (int i = 0; i < getallen.length; i++) {

            System.out.printf("Geef getal %d: ", i + 1);

            int invoer = Integer.parseInt(scanner.nextLine());

            getallen[i] = invoer;
        }

        Arrays.sort(getallen);

        for (int getal: getallen){
            System.out.println(getal);
        }
    }
}
