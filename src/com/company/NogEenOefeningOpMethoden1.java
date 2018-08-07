package com.company;

import java.util.Scanner;

public class NogEenOefeningOpMethoden1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef e-mailadres: ");

        String email = scanner.nextLine();

        while (!isGeldigEmailAdres(email)){

            System.out.println("Fout, kieken.");
            System.out.print("Geef e-mailadres: ");
            email = scanner.nextLine();
        }

        System.out.printf("Het adres is %s", email);

    }


    private static boolean isGeldigEmailAdres(String email) {


        boolean returnwaarde = false;

        if (email.indexOf('@') != -1) {

            if (email.indexOf('@') != email.lastIndexOf('@'))
                returnwaarde = false;


            if (email.indexOf('.') != -1) {

                if (email.indexOf('@') == email.indexOf('.') - 1)
                    returnwaarde = false;
                else
                    returnwaarde = true;

            }

        } else
            returnwaarde = false;


        return returnwaarde;

    }
}
