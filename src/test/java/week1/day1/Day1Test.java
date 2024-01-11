package week1.day1;

import dev.vinisantosn.week1.day1.NumberOutOfRangeException;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


import java.util.Optional;

import static dev.vinisantosn.week1.day1.Day1.CalcAge;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day1Test {
    @Test
    @DisplayName("Checks whether the age in years corresponds to the age in days.")
    public void checkAgeInDays() throws NumberOutOfRangeException {

        assertEquals( Optional.of(23725), Optional.of(CalcAge(65)));
        assertEquals( Optional.of(0),Optional.of(CalcAge(0)));
        assertEquals( Optional.of(7300),Optional.of(CalcAge(20)));
    }
}
