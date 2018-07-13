package com.company;

import java.util.Random;
import java.time.LocalDate;

public class WillekeurigeDatumVanDeDocent {
    public static void main(String[] args) {

        Random rnd = new Random();
        int jaar = rnd.nextInt(31) + 2000;
        int maand = rnd.nextInt(12) +1;
        int dag;
        switch(maand){
            case 2:
                if (jaar % 4 != 0) {
                    dag = rnd.nextInt(28) + 1;
                }else {
                    dag = rnd.nextInt(29) + 1;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                dag = rnd.nextInt(30) +1;
                break;
            default:
                dag = rnd.nextInt(31) +1;
        }
        System.out.println("Dag: " + dag);
        System.out.println("Maand: " + maand);
        System.out.println("Jaar: " + jaar);
        LocalDate datum = LocalDate.of(jaar, maand, dag);
        System.out.println(datum);
    }
}
