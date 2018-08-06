package com.company;

import java.util.Scanner;

public class Herhaling9 {

    public static void main(String[] args) {

        String[] namen = {"Karen", "Kristel", "Kathleen", "Josje", "Hanne", "Marthe", "Klaasje"};

        for(int i = 0; i < namen.length; i++){

            if (namen[i].charAt(0) != 'K') {


                namen[i] = 'K' + namen[i].substring(1);

            }
        }

        for (int i = 0; i < namen.length; i++) {
            System.out.println(namen[i]);
        }
    }
}
