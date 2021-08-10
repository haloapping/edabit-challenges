package haloapping.github.io.level.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void test1() {
        assertEquals(fizzBuzz.fizzBuzz(3), "Fizz");
    }

    @Test
    public void test2() {
        assertEquals(fizzBuzz.fizzBuzz(5), "Buzz");
    }

    @Test
    public void test3() {
        assertEquals(fizzBuzz.fizzBuzz(15), "FizzBuzz");
    }

    @Test
    public void test4() {
        assertEquals(fizzBuzz.fizzBuzz(10), "Buzz");
    }

    @Test
    public void test5() {
        assertEquals(fizzBuzz.fizzBuzz(98), "98");
    }
}
