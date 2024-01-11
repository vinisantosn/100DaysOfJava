package week1.day2;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static dev.vinisantosn.week1.day2.Day2.findNemo;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Day2Test {
    @Test
    @DisplayName("Validates whether the name was found and its position, if so")
    public void checkFindNemo(){
        assertEquals("I found Nemo at 4!", findNemo("I am finding Nemo !"));
        assertEquals("I found Nemo at 1!", findNemo("Nemo is me"));
        assertEquals("I found Nemo at 2!", findNemo("I Nemo am"));
        assertEquals("I can't find Nemo :(", findNemo("I am finding NeMo !"));
        assertEquals("I found Nemo at 3!", findNemo("I am Nemo and finding Nemo !"));
    }
}
