package com.company;

import java.time.LocalDate;

public class Herhaling2 {

    public static void main(String[] args) {

        LocalDate datum = LocalDate.now();

        if (datum.getDayOfMonth()<=15) {

            System.out.println("Je moet aan de linkerkant van de straat parkeren.");

        } else {
            System.out.println("Je moet aan de rechterkant van de straat parkeren.");
        }
    }
}