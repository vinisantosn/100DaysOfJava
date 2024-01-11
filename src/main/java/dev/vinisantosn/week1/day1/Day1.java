package dev.vinisantosn.week1.day1;

/**
 * @author vinisantosn
 * TITLE:
 * Convert Age to Days
 * TO DO:
 * Create a function that takes the age and return the age in days
 * NOTES:
 * Use 365 days as the length of a year for this challenge.
 * Ignore leap years and days between last birthday and now.
 * Expect only positive integer inputs.
 */
public class Day1 {
    public static void main(String[] args) throws NumberOutOfRangeException {
        CalcAge(65);
        CalcAge(0);
        CalcAge(20);
    }
    public static Integer CalcAge(Integer age) throws NumberOutOfRangeException {
        Integer lengthOfaYear = 365;
        if(age>=0){
            Integer days = age*lengthOfaYear;
            return days;
        }else {
            throw new NumberOutOfRangeException();
        }
    }
}
