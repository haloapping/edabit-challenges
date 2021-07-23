package haloapping.github.io.level.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringEndingMatchesSecondStringTest {
    StringEndingMatchesSecondString stringEndingMatchesSecondString = new StringEndingMatchesSecondString();

    @Test
    public void test1() {
        assertEquals("Nope!", true, stringEndingMatchesSecondString.checkEnding("abc", "bc"));
    }

    @Test
    public void test2() {
        assertEquals("Nope!", false, stringEndingMatchesSecondString.checkEnding("abc", "d"));
    }

    @Test
    public void test3() {
        assertEquals("Nope!", false, stringEndingMatchesSecondString.checkEnding("samurai", "zi"));
    }

    @Test
    public void test4() {
        assertEquals("Nope!", true, stringEndingMatchesSecondString.checkEnding("feminine", "nine"));
    }

    @Test
    public void test5() {
        assertEquals("Nope!", false, stringEndingMatchesSecondString.checkEnding("convention", "tio"));
    }

    @Test
    public void test6() {
        assertEquals("Nope!", false, stringEndingMatchesSecondString.checkEnding("cooperative", "ooper"));
    }

    @Test
    public void test7() {
        assertEquals("Nope!", true, stringEndingMatchesSecondString.checkEnding("extraterrestrial", "xtraterrestrial"));
    }

    @Test
    public void test8() {
        assertEquals("Nope!", true, stringEndingMatchesSecondString.checkEnding("access", "ss"));
    }

    @Test
    public void test9() {
        assertEquals("Nope!", false, stringEndingMatchesSecondString.checkEnding("motorist", "is"));
    }
}
