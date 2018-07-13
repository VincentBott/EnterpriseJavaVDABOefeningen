package com.company;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Datums {
    public static void main(String[] args) {

        LocalDate vandaag = LocalDate.now();

        int dag = vandaag.getDayOfMonth();

        int maand = vandaag.getMonthValue();

        int jaar = vandaag.getYear();

        Month maandEnum = vandaag.getMonth();


        System.out.println("De dag: "+ dag);

        System.out.println("De maand: " + maand);

        System.out.println("Het jaar: " + jaar);

        System.out.println(maandEnum);


  /*    Voor zelf een datum in te geven, bijvoorbeeld uit het verleden.

        AndereDatum :

        LocalDate.of()
*/



    }
}
