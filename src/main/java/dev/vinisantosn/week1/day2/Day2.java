package dev.vinisantosn.week1.day2;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author vinisantosn
 * TITLE:
 * Finding Nemo
 * TO DO:
 * You're given a string of words. You need to find the word "Nemo", and return a string like this: I found Nemo at [the order of the word you find nemo]!.
 * If you can't find Nemo, return I can't find Nemo :(.
 * NOTES:
 * ! , ? . are always separated from the last word.
 * Nemo will always look like Nemo, and not NeMo or other capital variations.
 * Nemo's, or anything that says Nemo with something behind it, doesn't count as Finding Nemo.
 * If there are multiple Nemo's in the sentence, only return for the first one.
 */
public class Day2 {
    public static void main(String[] args) {
        System.out.println(findNemo("Nemo is me"));
    }

    public static String findNemo(String stringOfWords) {


        String[] splitResult = stringOfWords.split(" ");
        List<String> list = asList(splitResult);

        Integer positionOfNemo = list.indexOf("Nemo") ;
        String msgSearchSuccess = "I found Nemo at " + (positionOfNemo + 1)  +"!";
        String msgSearchFailure = "I can't find Nemo :(";
        if(positionOfNemo!=-1)
            return msgSearchSuccess;
        else
            return msgSearchFailure;

    }
}
