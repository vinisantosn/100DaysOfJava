package dev.vinisantosn.week1.day4;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author vinisantosn
 * TITLE:
 * Is Johnny Making Progress?
 * TO DO:
 * To train for an upcoming marathon, Johnny goes on one long-distance run each Saturday.
 * He wants to track how often the number of miles he runs this Saturday exceeds the number of miles run the previous
 * Saturday. This is called a progress day.
 * Create a function that takes in an array of miles run every Saturday and returns Johnny's total number of progress
 * days.
 * NOTES:
 * Running the same number of miles as last week does not count as a progress day.
 */
public class Day4 {
    public static void main(String[] args) {
        System.out.println(progressDays(new Integer[]{3, 4, 1, 2}));
    }

    public static int progressDays(Integer[] integers) {
        List<Integer> listMilesRunEverySaturday = asList(integers);
        Integer numberOfProgressDays = 0;
        Integer previousItem = listMilesRunEverySaturday.get(0);
        for (Integer milesItem: listMilesRunEverySaturday
             ) {
            if (milesItem>previousItem) numberOfProgressDays++;
            previousItem = milesItem;
        }
        return numberOfProgressDays;
    }
}
