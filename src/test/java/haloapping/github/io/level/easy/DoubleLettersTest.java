package haloapping.github.io.level.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoubleLettersTest {
    DoubleLetters doubleLetters = new DoubleLetters();

    @Test
    public void test1() {
        assertEquals(true, doubleLetters.doubleLetters("loop"));
    }

    @Test
    public void test2() {
        assertEquals(true, doubleLetters.doubleLetters("meeting"));
    }

    @Test
    public void test3() {
        assertEquals(true, doubleLetters.doubleLetters("yummy"));
    }

    @Test
    public void test4() {
        assertEquals(true, doubleLetters.doubleLetters("moo"));
    }

    @Test
    public void test5() {
        assertEquals(true, doubleLetters.doubleLetters("toodles"));
    }

    @Test
    public void test6() {
        assertEquals(true, doubleLetters.doubleLetters("droop"));
    }

    @Test
    public void test7() {
        assertEquals(true, doubleLetters.doubleLetters("loot"));
    }

    @Test
    public void test8() {
        assertEquals(false, doubleLetters.doubleLetters("orange"));
    }

    @Test
    public void test9() {
        assertEquals(false, doubleLetters.doubleLetters("munchkin"));
    }

    @Test
    public void test10() {
        assertEquals(false, doubleLetters.doubleLetters("forestry"));
    }

    @Test
    public void test11() {
        assertEquals(false, doubleLetters.doubleLetters("raindrops"));
    }

    @Test
    public void test12() {
        assertEquals(false, doubleLetters.doubleLetters("gold"));
    }

    @Test
    public void test13() {
        assertEquals(false, doubleLetters.doubleLetters("paradise"));
    }

    @Test
    public void test14() {
        assertEquals(false, doubleLetters.doubleLetters("chicken"));
    }
}
