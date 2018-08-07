package com.company;

import java.util.Scanner;

public class ArraysDeelbaarDoorTwee {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] getallen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] getallen2 = new int[4];


        for (int i = 0; i < getallen.length; i++) {
            if (getallen[i] % 2 == 0)
                System.out.println(getallen[i]);
        }


        for(int getal: getallen) {
            if (getal % 2 == 0)
                System.out.println(getal);

        }
    }
}
