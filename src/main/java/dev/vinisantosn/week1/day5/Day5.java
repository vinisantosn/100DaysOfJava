package dev.vinisantosn.week1.day5;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author vinisantosn
 * TITLE:
 * Pair of Socks
 * TO DO:
 * Joseph is in the middle of packing for a vacation. He's having a bit of trouble finding all of his socks, though.
 * <p>
 * Write a function that returns the number of sock pairs he has. A sock pair consists of two of the same letter,
 * such as "AA". The socks are represented as an unordered sequence.
 * NOTES:
 */
public class Day5 {
    public static void main(String[] args) {
        System.out.println(SockPairs(""));
    }

    public static int SockPairs(String socksInTheDrawer) {

        if (!socksInTheDrawer.isEmpty()) {
            ArrayList<String> strList = new ArrayList<String>(
                    Arrays.asList(socksInTheDrawer.split("")));
            int qtdDepares = 0;

            Map<String, Long> counted = strList.stream()
                    .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

            for (Map.Entry<String, Long> pair : counted.entrySet()) {
                long l = pair.getValue() / 2;
                qtdDepares += l;
            }
            return qtdDepares;
        } else {
            return 0;
        }
    }
}
