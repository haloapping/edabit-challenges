package haloapping.github.io.level.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StutteringTest {
    Stuttering stuttering = new Stuttering();

    @Test
    public void test01() {
        assertEquals("in... in... increasing?", stuttering.stutter("increasing"));
    }

    @Test
    public void test02() {
        assertEquals("ad... ad... adventures?", stuttering.stutter("adventures"));
    }

    @Test
    public void test03() {
        assertEquals("en... en... enticing?", stuttering.stutter("enticing"));
    }

    @Test
    public void test04() {
        assertEquals("un... un... unacceptable?", stuttering.stutter("unacceptable"));
    }

    @Test
    public void test05() {
        assertEquals("ac... ac... accountable?", stuttering.stutter("accountable"));
    }

    @Test
    public void test06() {
        assertEquals("in... in... incredible?", stuttering.stutter("incredible"));
    }

    @Test
    public void test07() {
        assertEquals("ex... ex... exquisite?", stuttering.stutter("exquisite"));
    }

    @Test
    public void test08() {
        assertEquals("am... am... am?", stuttering.stutter("am"));
    }

    @Test
    public void test09() {
        assertEquals("en... en... enduring?", stuttering.stutter("enduring"));
    }

    @Test
    public void test10() {
        assertEquals("ou... ou... outstanding?", stuttering.stutter("outstanding"));
    }

    @Test
    public void test11() {
        assertEquals("as... as... astonishing?", stuttering.stutter("astonishing"));
    }

    @Test
    public void test12() {
        assertEquals("as... as... astounding?", stuttering.stutter("astounding"));
    }

    @Test
    public void test13() {
        assertEquals("im... im... impressive?", stuttering.stutter("impressive"));
    }

    @Test
    public void test14() {
        assertEquals("re... re... revolutionize?", stuttering.stutter("revolutionize"));
    }

    @Test
    public void test15() {
        assertEquals("re... re... recurring?", stuttering.stutter("recurring"));
    }

    @Test
    public void test16() {
        assertEquals("re... re... recollection?", stuttering.stutter("recollection"));
    }

    @Test
    public void test17() {
        assertEquals("so... so... so?", stuttering.stutter("so"));
    }

    @Test
    public void test18() {
        assertEquals("go... go... gorgeous?", stuttering.stutter("gorgeous"));
    }

    @Test
    public void test19() {
        assertEquals("ca... ca... captivating?", stuttering.stutter("captivating"));
    }
}
