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
    public void should_return_Buzz_when_5() {
        int number = 5;
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals("Buzz", result);
    }

    @Test
    public void should_return_whizz_when_7() {
        int number = 7;
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals("Whizz", result);
    }

    @Test
    public void should_return_fizzbuzz_when_15() {
        int number = 15;
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void should_return_fizz_when_13() {
        int number = 13;
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals("Fizz", result);
    }

    @Test
    public void should_return_buzzwhizz_when_35() {
        int number = 35;
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals("BuzzWhizz", result);
    }

    @Test
    public void should_return_fizz_when_75() {
        int number = 75;
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals("Fizz", result);
    }


}