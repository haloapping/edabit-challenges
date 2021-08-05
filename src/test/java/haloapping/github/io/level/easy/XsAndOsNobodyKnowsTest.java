package haloapping.github.io.level.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class XsAndOsNobodyKnowsTest {
    XsAndOsNobodyKnows xsAndOsNobodyKnows = new XsAndOsNobodyKnows();

    @Test
    public void test1() {
        assertEquals(true, xsAndOsNobodyKnows.getXO("ooxx"));
    }

    @Test
    public void test2() {
        assertEquals(false, xsAndOsNobodyKnows.getXO("xooxx"));
    }

    @Test
    public void test3() {
        assertEquals(true, xsAndOsNobodyKnows.getXO("ooxXm"));
    }

    @Test
    public void test4() {
        assertEquals(true, xsAndOsNobodyKnows.getXO("zpzpzpp"));
    }

    @Test
    public void test5() {
        assertEquals(false, xsAndOsNobodyKnows.getXO("zzoo"));
    }

    @Test
    public void test6() {
        assertEquals(true, xsAndOsNobodyKnows.getXO("Xo"));
    }

    @Test
    public void test7() {
        assertEquals(false, xsAndOsNobodyKnows.getXO("x"));
    }

    @Test
    public void test8() {
        assertEquals(false, xsAndOsNobodyKnows.getXO("o"));
    }

    @Test
    public void test9() {
        assertEquals(false, xsAndOsNobodyKnows.getXO("xxxoo"));
    }

    @Test
    public void test10() {
        assertEquals(true, xsAndOsNobodyKnows.getXO(""));
    }
}
