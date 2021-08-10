package haloapping.github.io.level.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringOrIntegerTest {
    StringOrInteger stringOrInteger = new StringOrInteger();

    @Test
    public void test1() {
        assertEquals("int", stringOrInteger.intOrString(1));
    }

    @Test
    public void test2() {
        assertEquals("str", stringOrInteger.intOrString("HELLO"));
    }

    @Test
    public void test3() {
        assertEquals("str", stringOrInteger.intOrString("edabit"));
    }

    @Test
    public void test4() {
        assertEquals("int", stringOrInteger.intOrString(873432874));
    }

    @Test
    public void test5() {
        assertEquals("int", stringOrInteger.intOrString(5));
    }
}
