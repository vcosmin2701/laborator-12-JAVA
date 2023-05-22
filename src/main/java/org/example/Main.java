package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaNume = Arrays.asList("Vasile", "Ion", "Mihai", "Cosmin", "MyShU", "ARPA", "LOL");
        // filter
        System.out.println("-----------------------------");
        listaNume.stream()
                .filter(nume -> nume.length() < 4)
                .forEach(nume -> System.out.println(nume));


        //map
        System.out.println("-----------------------------");
        listaNume.stream()
                .filter(nume -> nume.length() > 5)
                .map(nume -> nume.length())
                .forEach(nume -> System.out.println(nume));

        System.out.println("-----------------------------");

        String placeHolder = listaNume.stream()
                .filter(nume -> nume.length() < 5)
                .reduce("", (initialPlacE, newPlace) -> initialPlacE + " " + newPlace);
        System.out.println(placeHolder);
    }

}