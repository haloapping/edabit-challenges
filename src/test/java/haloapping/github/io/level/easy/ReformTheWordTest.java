package haloapping.github.io.level.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReformTheWordTest {
    ReformTheWord reformTheWord = new ReformTheWord();

    @Test
    public void test1() {
        assertEquals("Magazine", reformTheWord.getWord("maga", "zine"));
    }

    @Test
    public void test2() {
        assertEquals("Reliable", reformTheWord.getWord("reli", "able"));
    }

    @Test
    public void test3() {
        assertEquals("Implicit", reformTheWord.getWord("impl", "icit"));
    }

    @Test
    public void test4() {
        assertEquals("Document", reformTheWord.getWord("docu", "ment"));
    }

    @Test
    public void test5() {
        assertEquals("Opposite", reformTheWord.getWord("oppo", "site"));
    }

    @Test
    public void test6() {
        assertEquals("Official", reformTheWord.getWord("offi", "cial"));
    }

    @Test
    public void test7() {
        assertEquals("Disagree", reformTheWord.getWord("disa", "gree"));
    }

    @Test
    public void test8() {
        assertEquals("Accident", reformTheWord.getWord("acci", "dent"));
    }

    @Test
    public void test9() {
        assertEquals("Omission", reformTheWord.getWord("omis", "sion"));
    }

    @Test
    public void test10() {
        assertEquals("Vigorous", reformTheWord.getWord("vigo", "rous"));
    }

    @Test
    public void test11() {
        assertEquals("Predator", reformTheWord.getWord("pred", "ator"));
    }

    @Test
    public void test12() {
        assertEquals("Progress", reformTheWord.getWord("prog", "ress"));
    }

    @Test
    public void test13() {
        assertEquals("Invasion", reformTheWord.getWord("inva", "sion"));
    }

    @Test
    public void test14() {
        assertEquals("Farewell", reformTheWord.getWord("fare", "well"));
    }

    @Test
    public void test15() {
        assertEquals("Majority", reformTheWord.getWord("majo", "rity"));
    }

    @Test
    public void test16() {
        assertEquals("Personal", reformTheWord.getWord("pers", "onal"));
    }

    @Test
    public void test17() {
        assertEquals("Sequence", reformTheWord.getWord("sequ", "ence"));
    }

    @Test
    public void test18() {
        assertEquals("Governor", reformTheWord.getWord("gove", "rnor"));
    }

    @Test
    public void test19() {
        assertEquals("Ignorant", reformTheWord.getWord("igno", "rant"));
    }

    @Test
    public void test20() {
        assertEquals("Finished", reformTheWord.getWord("fini", "shed"));
    }
}
