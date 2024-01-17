package week1.day5;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


import static dev.vinisantosn.week1.day5.Day5.SockPairs;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Day5Test {
    @Test
    @DisplayName("Validates returns the number of sock pairs he has")
    public void checkSockPairs(){
        assertEquals(1, SockPairs("AA"));
        assertEquals(2, SockPairs("ABABC") );
        assertEquals(4, SockPairs("CABBACCC"));
        assertEquals(0, SockPairs(""));
    }
}