package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Geef BTW code (1 of 2): ");

        Scanner scanner = new Scanner(System.in);

        int btwCode = Integer.parseInt(scanner.nextLine());
        double procent;

        switch(btwCode) {
            case 1:
                procent = 0.06;
                break;               // break verplicht ! Anders blijft hij doorlopen naar de volgende case !
            case 2:
                procent = 0.21;
                break;
            default:
                procent = 0;
        }


 /*       if (btwCode == 1) {
            procent= 0.06;
        } else if (btwCode == 2 ){
            procent = 0.21;
        } else {
            procent = 0;
        }
*/

        System.out.println("Het percentage is: " + procent);
    }
}
