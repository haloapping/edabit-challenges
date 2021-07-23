package haloapping.github.io.level.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangularNumberSequenceTest {
    TriangularNumberSequence triangularNumberSequence = new TriangularNumberSequence();

    @Test
    public void test1() {
        assertEquals(1, triangularNumberSequence.triangle(1));
    }

    @Test
    public void test2() {
        assertEquals(3, triangularNumberSequence.triangle(2));
    }

    @Test
    public void test3() {
        assertEquals(6, triangularNumberSequence.triangle(3));
    }

    @Test
    public void test4() {
        assertEquals(36, triangularNumberSequence.triangle(8));
    }

    @Test
    public void test5() {
        assertEquals(2318781, triangularNumberSequence.triangle(2153));
    }
}
