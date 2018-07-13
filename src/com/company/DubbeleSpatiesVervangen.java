package com.company;

import java.util.Scanner;

public class DubbeleSpatiesVervangen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String tekst;
        String tekstZonderSpaties = "";


        System.out.print("Geef een tekst: ");

        tekst = scanner.nextLine();


        if (tekst.contains("  "))
            tekstZonderSpaties = tekst.replaceAll("\\s+", " ");


        System.out.println("\nUw tekst zonder dubbele spaties: \"" + tekstZonderSpaties + "\"");
    }
}
