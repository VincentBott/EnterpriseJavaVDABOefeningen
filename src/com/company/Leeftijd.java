package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Leeftijd {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int geboortedag, geboortemaand, geboortejaar;
        int leeftijd;

        int leeftijdJaar, leeftijdMaand, leeftijdDag;

        int huidigeDag, huidigeMaand, huidigJaar;

        LocalDate huidigeDatum = LocalDate.now();


        huidigeDag = huidigeDatum.getDayOfMonth();
        huidigeMaand = huidigeDatum.getMonthValue();
        huidigJaar = huidigeDatum.getYear();


        System.out.print("Geef geboortedag: ");

        geboortedag = Integer.parseInt(scanner.nextLine());

        System.out.print("Geef geboortemaand: ");

        geboortemaand = Integer.parseInt(scanner.nextLine());

        System.out.print("Geef geboortejaar: ");

        geboortejaar = Integer.parseInt(scanner.nextLine());

        leeftijdJaar = huidigJaar - geboortejaar;

        if (huidigeMaand == geboortemaand) {

             if (huidigeDag < geboortedag){
                 leeftijdJaar--;
            }
        }
        if (huidigeMaand < geboortemaand) {
            leeftijdJaar--;
        }

/* Bovenstaande kan ook met:

        LocalDate verjaardag

        if (verjaardag.isAfter(vandaag));
            leeftijd--;
*/

        leeftijd = leeftijdJaar;

        System.out.println("Je bent " + leeftijd + " jaar oud.");


    }
}
