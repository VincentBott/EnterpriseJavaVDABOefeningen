package com.company;

import java.util.Scanner;

public class NogEenOefeningOpMethoden5 {


    public static void main(String[] args) {

        String tevertalen = "Heel goed. Ik houd van goud, aha";

        String westVlaams = vertaalWVL(tevertalen);

        System.out.println("In het Westvlaams: " + westVlaams);

        String limburgs = vertaalLim(tevertalen);

        System.out.println("In het Limburgs: " +limburgs);

        String antwerps = vertaalAnt(tevertalen);

        System.out.println("In het Antwerps: " + antwerps);
    }

    private static String vertaalWVL(String teVertalen) {


        String inHetWestVlaams;

        char[] tekstArray = teVertalen.toCharArray();


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

        return inHetWestVlaams;
    }

    private static String vertaalLim(String teVertalen) {

        String limburgs;


        limburgs = teVertalen.replaceAll("a","aa");

        limburgs = limburgs.replaceAll("e","ee");

        limburgs = limburgs.replaceAll("o","oo");

        limburgs = limburgs.replaceAll("u","uu");


        return limburgs;

    }

    private static String vertaalAnt(String teVertalen) {

/*
        String antwerps = "";

        int positie;

        char[] tekstArray = teVertalen.toCharArray();

        char[] tekstArrayZonderOverbodigeSpaties = tekstArray;


        for (int i = 0; i < tekstArray.length; i++) {

            //   if (tekstArray[i] == ' ')
            //    if ((tekstArray[i+1]) == 'h')
            //       tekstArray[i+1] = ' ';

            if (tekstArray[i] == 'h')
                tekstArray[i] = ' ';

            if (tekstArray[i] == 'H')
                tekstArray[i] = ' ';

        }

        for (int i = 0; i < tekstArray.length; i++) {

            if (i == 0) {
                if (tekstArray[i] == ' ')
                    tekstArrayZonderOverbodigeSpaties[i - 1] = tekstArray[i + 1];
            }

            if (i > 0)
                if (tekstArray[i] == ' ')
                    if (tekstArray[i-1] == ' ')
                        tekstArrayZonderOverbodigeSpaties[i-1] = tekstArray[i];


        }

        antwerps = new String(tekstArrayZonderOverbodigeSpaties);


        return antwerps;

*/


        String inHetAntwerps = "";

        boolean vorigeIsSpatie = true;


        for (int i = 0; i < teVertalen.length(); i++) {

            if (!(vorigeIsSpatie && (teVertalen.charAt(i) == 'h' || teVertalen.charAt(i) == 'H'))){

                inHetAntwerps += teVertalen.charAt(i);
            }

            vorigeIsSpatie = teVertalen.charAt(i) == ' ';
        }

        return inHetAntwerps;

    }


}
