package com.company;

import java.util.Scanner;

public class OefeningOpDebugging {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int puntenInformatica;
        int puntenBoekhouden;
        int puntenWiskunde;


            do {
                System.out.print("Geef punten voor informatica: ");
                puntenInformatica = Integer.parseInt(scanner.nextLine());
            } while (puntenInformatica < 0 || puntenInformatica > 10);

            do {
                System.out.print("Geef punten voor boekhouden: ");
                puntenBoekhouden = Integer.parseInt(scanner.nextLine());
            } while (puntenBoekhouden < 0 || puntenBoekhouden > 10);

            do {
                System.out.print("Geef punten voor wiskunde: ");
                puntenWiskunde = Integer.parseInt(scanner.nextLine());
            } while (puntenWiskunde < 0 || puntenWiskunde > 10);

            int puntenWiskundeEnBoekhouden = puntenWiskunde + puntenBoekhouden;


            if (puntenInformatica >= 7 && puntenWiskundeEnBoekhouden >= 12) {
                System.out.println("Je bent geslaagd");
            } else {
                System.out.println("Je bent niet geslaagd");
                if (puntenInformatica < 7) {
                    System.out.println("\tJe had te weinig punten voor informatica");
                }

                if (puntenWiskundeEnBoekhouden < 12) {
                    System.out.println("\tJe had te weinig punten voor wiskunde en boekhouden");
                }
            }

    }
}
