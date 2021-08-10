package haloapping.github.io.level.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatingLettersTest {
    RepeatingLetters repeatingLetters = new RepeatingLetters();

    @Test
    public void test1() {
        assertEquals("SSttrriinngg", repeatingLetters.doubleChar("String"));
    }

    @Test
    public void test2() {
        assertEquals("HHeelllloo  WWoorrlldd!!", repeatingLetters.doubleChar("Hello World!"));
    }

    @Test
    public void test3() {
        assertEquals("11223344!!__  ", repeatingLetters.doubleChar("1234!_ "));
    }

    @Test
    public void test4() {
        assertEquals("####^^&&%%%%**&&%%%%$$##@@@@!!", repeatingLetters.doubleChar("##^&%%*&%%$#@@!"));
    }

    @Test
    public void test5() {
        assertEquals("ssccaannddaall", repeatingLetters.doubleChar("scandal"));
    }

    @Test
    public void test6() {
        assertEquals("eeccoonnoommiiccss", repeatingLetters.doubleChar("economics"));
    }

    @Test
    public void test7() {
        assertEquals("  ", repeatingLetters.doubleChar(" "));
    }

    @Test
    public void test8() {
        assertEquals("______________", repeatingLetters.doubleChar("_______"));
    }

    @Test
    public void test9() {
        assertEquals("eeqquuiipp  ggaalllloonn  rreeaadd", repeatingLetters.doubleChar("equip gallon read"));
    }

    @Test
    public void test10() {
        assertEquals("bbaabbyy  iinnccrreeaassee", repeatingLetters.doubleChar("baby increase"));
    }
}
