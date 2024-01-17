package dev.vinisantosn.week1.day6;

/**
 * @author vinisantosn
 * TITLE:
 * Next Prime
 * TO DO:
 * Given an integer, create a function that returns the next prime. If the number is prime, return the number itself.
 * NOTES:
 * N/A
 */
public class Day6 {
    public static void main(String[] args) {
        System.out.println(NextPrime(8));
    }

    public static int NextPrime(int number) {
        Integer nextPrimeNumber = null;
        while (!itsPrime(number)){
            number++;
        }
        nextPrimeNumber = number;
        return nextPrimeNumber;

    }

    private static boolean itsPrime(int number) {
        for (int i=2; i<number;i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
