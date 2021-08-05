package haloapping.github.io.level.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShuffleTheNameTest {
    ShuffleTheName shuffleTheName = new ShuffleTheName();

    @Test
    public void test1() {
        assertEquals("Trump Donald", shuffleTheName.nameShuffle("Donald Trump"));
    }

    @Test
    public void test2() {
        assertEquals("O'Donnel Rosie", shuffleTheName.nameShuffle("Rosie O'Donnel"));
    }

    @Test
    public void test3() {
        assertEquals("Butts Seymour", shuffleTheName.nameShuffle("Seymour Butts"));
    }

    @Test
    public void test4() {
        assertEquals("Greene Ebony", shuffleTheName.nameShuffle("Ebony Greene"));
    }

    @Test
    public void test5() {
        assertEquals("Kennedy Ken", shuffleTheName.nameShuffle("Ken Kennedy"));
    }

    @Test
    public void test6() {
        assertEquals("Gonzalez Allison", shuffleTheName.nameShuffle("Allison Gonzalez"));
    }

    @Test
    public void test7() {
        assertEquals("Frazier Albert", shuffleTheName.nameShuffle("Albert Frazier"));
    }

    @Test
    public void test8() {
        assertEquals("Hopkins Eloise", shuffleTheName.nameShuffle("Eloise Hopkins"));
    }

    @Test
    public void test9() {
        assertEquals("Welch Donnie", shuffleTheName.nameShuffle("Donnie Welch"));
    }

    @Test
    public void test10() {
        assertEquals("Thomas Vernon", shuffleTheName.nameShuffle("Vernon Thomas"));
    }
}
