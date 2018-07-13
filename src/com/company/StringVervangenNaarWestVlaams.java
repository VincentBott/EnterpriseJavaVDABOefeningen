package com.company;

import java.util.Scanner;

public class StringVervangenNaarWestVlaams {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String tekst;
        String inHetWestVlaams;


        System.out.print("Geef een tekst: ");
        tekst = scanner.nextLine();

        char[] tekstArray = tekst.toCharArray();


        for (int i = 0; i < tekstArray.length; i++) {

            switch (tekstArray[i]){
                case 'h':
                    tekstArray[i] = 'g';
                    break;
                case 'g':
                    tekstArray[i] = 'h';
                    break;
                case 'G':
                    tekstArray[i] = 'H';
                    break;
                case 'H':
                    tekstArray[i] = 'G';
            }
        }

        inHetWestVlaams = new String(tekstArray);
        System.out.print("\nIn het West-Vlaams: " + inHetWestVlaams);
    }
}
