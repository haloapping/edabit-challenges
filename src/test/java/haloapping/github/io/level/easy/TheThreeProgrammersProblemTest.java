package haloapping.github.io.level.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheThreeProgrammersProblemTest {
    TheThreeProgrammersProblem theThreeProgrammersProblem = new TheThreeProgrammersProblem();

    @Test
    public void test1() {
        assertEquals(8, theThreeProgrammersProblem.programmers(1, 5, 9));
    }

    @Test
    public void test2() {
        assertEquals(10, theThreeProgrammersProblem.programmers(43, 33, 43));
    }

    @Test
    public void test3() {
        assertEquals(74, theThreeProgrammersProblem.programmers(88, 14, 23));
    }

    @Test
    public void test4() {
        assertEquals(41, theThreeProgrammersProblem.programmers(33, 72, 74));
    }

    @Test
    public void test5() {
        assertEquals(493, theThreeProgrammersProblem.programmers(147, 33, 526));
    }

    @Test
    public void test6() {
        assertEquals(223, theThreeProgrammersProblem.programmers(234, 345, 457));
    }
}
