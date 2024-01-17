package week1.day6;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


import static dev.vinisantosn.week1.day6.Day6.NextPrime;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Day6Test {
    @Test
    @DisplayName("Validates returns the next prime")
    public void checkSockPairs(){
        assertEquals(13, NextPrime(12));
        assertEquals(29, NextPrime(24) );
        assertEquals(11, NextPrime(11));
    }
}
