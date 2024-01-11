package dev.vinisantosn.week1.day3;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author vinisantosn
 * TITLE:
 * Barbecue Skewers
 * TO DO:
 * You are in charge of the barbecue grill. A vegetarian skewer is a skewer that has only vegetables (-o).
 * A non-vegetarian skewer is a skewer with at least one piece of meat (-x).
 *
 *
 */
public class Day3 {
    public static void main(String[] args) {
        System.out.println(typeOfSkewers(new String[]{
                "--oooo-ooo--",
                "--xx--x--xx--",
                "--o---o--oo--",
                "--xx--x--ox--",
                "--xx--x--ox--"
        }));

    }

    public static String typeOfSkewers(String[] bbqGrill) {
        List<String> listSkewers = asList(bbqGrill);
        Integer numberOfVegetarianSkewers = 0;
        Integer numberOfNonVegetarianSkewers = 0;

        for (String skewers: listSkewers
             ) {
            if (skewers.contains("o") && skewers.contains("x"))
                numberOfNonVegetarianSkewers++;
            else if (!skewers.contains("o") && skewers.contains("x")) {
                numberOfNonVegetarianSkewers++;
            } else if (skewers.contains("o") && !skewers.contains("x")) {
                numberOfVegetarianSkewers++;
            }
        }
        Integer[] result = new Integer[]{numberOfVegetarianSkewers,numberOfNonVegetarianSkewers};

        return Arrays.toString(result);
    }

}
