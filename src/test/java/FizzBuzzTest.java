import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void should_return_number() {
        int number = 0;
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals("0", result);
    }

    @Test
    public void should_return_fizz_when_3() {
        int number = 3;
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals("Fizz", result);
    }
}