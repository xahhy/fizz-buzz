import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void should_return_number() {
        int number = 1;
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals("1", result);
    }

    @Test
    public void should_return_fizz_when_3() {
        int number = 3;
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals("Fizz", result);
    }

    @Test
    public void should_return_fizz_when_6() {
        int number = 6;
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals("Fizz", result);
    }

    @Test
    public void should_return_buzz_when_5() {
        int number = 5;
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals("Buzz", result);
    }

    @Test
    public void should_return_buzz_when_10() {
        int number = 10;
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals("Buzz", result);
    }
}