package haloapping.github.io.level.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciNumberTest {
    FibonacciNumber fibonacciNumber = new FibonacciNumber();

    @Test
    public void test1() {
        assertEquals(8, fibonacciNumber.fibonacci(6));
    }

    @Test
    public void test2() {
        assertEquals(13, fibonacciNumber.fibonacci(7));
    }

    @Test
    public void test3() {
        assertEquals(144, fibonacciNumber.fibonacci(12));
    }

    @Test
    public void test4() {
        assertEquals(0, fibonacciNumber.fibonacci(0));
    }

    @Test
    public void test5() {
        assertEquals(1, fibonacciNumber.fibonacci(1));
    }
}
