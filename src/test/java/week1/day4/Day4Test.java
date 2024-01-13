package week1.day4;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static dev.vinisantosn.week1.day4.Day4.progressDays;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Day4Test {
    @Test
    @DisplayName("Validates returns of total number of progress days")
    public void checkProgressDays(){
        assertEquals(2, progressDays(new Integer[]{3, 4, 1, 2}));
        assertEquals(3, progressDays(new Integer[]{10, 11, 12, 9, 10}));
        assertEquals(1, progressDays(new Integer[]{6, 5, 4, 3, 2, 9}));
        assertEquals(0, progressDays(new Integer[]{9,9}));
    }
}
