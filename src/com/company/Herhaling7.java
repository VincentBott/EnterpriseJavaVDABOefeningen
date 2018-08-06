package com.company;

import java.util.Scanner;

public class Herhaling7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hoeveel namen wil je ingeven? ");

        int aantal = Integer.parseInt(scanner.nextLine());

        String[] namen = new String[aantal];

        for (int i = 0; i < namen.length; i++) {
            System.out.printf("Geef naam %d: ", i + 1);
            namen[i] = scanner.nextLine();
        }

        int aantalK = 0;

        for(String naam: namen){
            if (naam.startsWith("K")) aantalK++;
        }

        String lijst = String.join(", ", namen);
        System.out.printf("In de lijst \"%s\" zijn er %d namen die met een 'K' beginnen.", lijst, aantalK);
    }
}
