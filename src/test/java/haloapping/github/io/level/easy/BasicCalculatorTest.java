package haloapping.github.io.level.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicCalculatorTest {
    BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    public void test1() {
        assertEquals(1, basicCalculator.calculator(2, '/', 2));
    }

    @Test
    public void test2() {
        assertEquals(3, basicCalculator.calculator(10, '-', 7));
    }

    @Test
    public void test3() {
        assertEquals(32, basicCalculator.calculator(2, '*', 16));
    }

    @Test
    public void test4() {
        assertEquals(0, basicCalculator.calculator(2, '-', 2));
    }

    @Test
    public void test5() {
        assertEquals(41, basicCalculator.calculator(15, '+', 26));
    }

    @Test
    public void test6() {
        assertEquals(4, basicCalculator.calculator(2, '+', 2));
    }

    @Test
    public void test7() {
        assertEquals(0, basicCalculator.calculator(2, '/', 0));
    }
}
