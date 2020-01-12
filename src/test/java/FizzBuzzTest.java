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
    public void should_return_fizz_when_number_can_multiplied_by_3() {
        String result = FizzBuzz.fizzBuzz(3);
        assertEquals("Fizz", result);

        String result2 = FizzBuzz.fizzBuzz(6);
        assertEquals("Fizz", result2);

    }

    @Test
    public void should_return_buzz_when_number_can_multiplied_by_5() {
        String result = FizzBuzz.fizzBuzz(5);
        assertEquals("Buzz", result);

        String result2 = FizzBuzz.fizzBuzz(10);
        assertEquals("Buzz", result2);
    }

    @Test
    public void should_return_whizz_when_number_can_multiplied_by_7() {
        String result = FizzBuzz.fizzBuzz(7);
        assertEquals("Whizz", result);

        String result2 = FizzBuzz.fizzBuzz(14);
        assertEquals("Whizz", result2);
    }

    @Test
    public void should_return_fizzbuzz_when_number_can_be_multiplied_by_3_5() {
        String result = FizzBuzz.fizzBuzz(15);
        assertEquals("Buzz", result);

        String result2 = FizzBuzz.fizzBuzz(30);
        assertEquals("Fizz", result2);
    }

    @Test
    public void should_return_fizz_when_number_contains_3() {
        String result = FizzBuzz.fizzBuzz(30);
        assertEquals("Fizz", result);

        String result2 = FizzBuzz.fizzBuzz(13);
        assertEquals("Fizz", result2);
    }


    @Test
    public void should_ignore_multipled_by_3_and_contains_3_when_contains_5() {
        String result = FizzBuzz.fizzBuzz(35);
        assertEquals("BuzzWhizz", result);
    }

    @Test
    public void should_ignore_multiplied_by_5_and_contains_5_when_contains_7() {
        String result = FizzBuzz.fizzBuzz(75);
        assertEquals("Fizz", result);
    }
}