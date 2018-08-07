package com.company;

import java.util.Scanner;


public class KlassenLeeftijd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wat is je leeftijd?");

        int leeftijd = Integer.parseInt(scanner.nextLine());


        if (heeftToegang(leeftijd)){
            System.out.println("Je hebt toegang");
        } else {
            System.out.println("je hebt geen toegang");
        }
    }

    private static boolean heeftToegang(int leeftijd){

        if (leeftijd >= 18){
            return true;
        }else {
            return false;
        }
    }
}
