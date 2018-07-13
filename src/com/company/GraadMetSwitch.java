package com.company;

import java.util.Scanner;

public class GraadMetSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String invoer;

 //       do {
            System.out.print("Geef de punten (0-20): ");

            invoer = scanner.nextLine();

            int punten = Integer.parseInt(invoer);
            String graad;

            switch (punten) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    graad = "Onvoldoende";
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                    graad = "Voldoende";
                    break;
                case 14:
                case 15:
                    graad = "Onderscheiding";
                    break;
                case 16:
                case 17:
                    graad = "Grote onderscheiding";
                    break;
                case 18:
                case 19:
                case 20:
                    graad = "Grootste onderscheiding";
                    break;
                default:
                    graad = "Ongeldige punten";
            }

            System.out.println(graad);

 //       } while (invoer != "stop");
    }
}