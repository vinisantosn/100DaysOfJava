package week1.day3;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


import static dev.vinisantosn.week1.day3.Day3.typeOfSkewers;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day3Test {
    @Test
    @DisplayName("validate the return of vegetarian skewers or not.")
    public void checkReturnOfTypeOfSkewers() {
        assertEquals("[2, 3]", typeOfSkewers(new String[]{
                "--oooo-ooo--",
                "--xx--x--xx--",
                "--o---o--oo--",
                "--xx--x--ox--",
                "--xx--x--ox--"
        }));
        assertEquals("[1, 4]", typeOfSkewers(new String[]{
                "--xo--x--ox--",
                "--xx--x--xx--",
                "--oo--o--oo--",
                "--xx--x--ox--",
                "--xx--x--ox--"
        }));
        assertEquals("[3, 2]", typeOfSkewers(new String[]{
                "--oooo-ooo--",
                "--xxxxxxxx--",
                "--o---",
                "-o-----o---x--",
                "--o---o-----"
        }));
    }
}
