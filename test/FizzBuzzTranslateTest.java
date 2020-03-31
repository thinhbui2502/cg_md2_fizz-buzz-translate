import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    @Test
    void TestFizz() {
        String expected = FIZZ;
        String result = FizzBuzzTranslate.showFizzBuzz(3);
        assertEquals(expected, result);
    }

    @Test
    void TestBuzz() {
        String expected = BUZZ;
        String result = FizzBuzzTranslate.showFizzBuzz(5);
        assertEquals(expected, result);
    }

    @Test
    void TestFizzBuzz() {
        String expected = FIZZ_BUZZ;
        String result = FizzBuzzTranslate.showFizzBuzz(15);
        assertEquals(expected, result);
    }


    @Test
    void TestTranslateNumberBelow10() {
        String expected = "two";
        String result = FizzBuzzTranslate.translate(2);
        assertEquals(expected,result);
    }

    @Test
    void TestTranslateNumberAbove10() {
        String expected = "two three";
        String result = FizzBuzzTranslate.translate(23);
        assertEquals(expected,result);
    }
}