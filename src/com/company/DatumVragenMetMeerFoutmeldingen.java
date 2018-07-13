package com.company;

import java.util.Scanner;
import java.time.LocalDate;

public class DatumVragenMetMeerFoutmeldingen {

    public static void main(String[] args) {

        LocalDate vandaag = LocalDate.now();
        Scanner invoer = new Scanner(System.in);

        System.out.print("Geef een jaar in de toekomst: ");
        int jaarGevraagd = Integer.parseInt(invoer.nextLine());
        int jaar = vandaag.getYear();

        while (jaar > jaarGevraagd) {
            System.out.print("Het opgegeven jaar moet minstens 2018 betreffen. Geef een nieuw jaar in: ");
            jaarGevraagd = Integer.parseInt(invoer.nextLine());
        }

        System.out.print("Geef een maand in de toekomst: ");

        int maandGevraagd = Integer.parseInt(invoer.nextLine());
        int maand = vandaag.getMonthValue();

        while (maand > maandGevraagd && jaarGevraagd <= jaar) {
            System.out.print("De opgegeven maand moet in de toekomst liggen. Geef een nieuwe maand in: ");
            maandGevraagd = Integer.parseInt(invoer.nextLine());
        }

        System.out.print("Geef een dag in de toekomst: ");

        int dagGevraagd = Integer.parseInt(invoer.nextLine());
        int dag = vandaag.getDayOfMonth();

        while (dagGevraagd <= dag && maandGevraagd <= maand && jaarGevraagd <= jaar) {

            System.out.print("De opgegeven dag moet in de toekomst liggen. Geef een nieuwe dag in: ");
            dagGevraagd = Integer.parseInt(invoer.nextLine());

        }

        System.out.println("De ingegeven datum is " + dagGevraagd + "/" + maandGevraagd + "/" + jaarGevraagd);

    }
}
