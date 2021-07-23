package haloapping.github.io.level.easy;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.Matcher;
import org.junit.Test;

public class HowMuchIsTrueTest {
    HowMuchIsTrue howMuchIsTrue = new HowMuchIsTrue();

    @Test
    public void test1() {
        assertThat(howMuchIsTrue.countTrue(new boolean[]{true, false, false, true, false}), is(2));
    }

    @Test
    public void test2() {
        assertThat(howMuchIsTrue.countTrue(new boolean[]{false, false, false, false}), is(0));
    }


    @Test
    public void test3() {
        assertThat(howMuchIsTrue.countTrue(new boolean[]{}), is(0));
    }

    @Test
    public void test4() {
        assertThat(howMuchIsTrue.countTrue(new boolean[]{false, false, true, true, false, false, false, true, true, true,
                true, false, true, true, false}), is(8));
    }

    @Test
    public void test5() {
        assertThat(howMuchIsTrue.countTrue(new boolean[]{true, false, true, true, false, false, false, false, false}),
                is(3));
    }

    @Test
    public void test6() {
        assertThat(howMuchIsTrue.countTrue(new boolean[]{false, true, true, false, true, true, false, true, false, true,
                false, true, false, true, false}), is(8));
    }

    @Test
    public void test7() {
        assertThat(
                howMuchIsTrue.countTrue(new boolean[]{true, false, true, true, true, false, true, true, false, false}),
                is(6));
    }

    @Test
    public void test8() {
        assertThat(
                howMuchIsTrue.countTrue(
                        new boolean[]{false, false, false, false, true, false, true, false, true, false, false}),
                is(3));
    }

    @Test
    public void test9() {
        assertThat(
                howMuchIsTrue.countTrue(
                        new boolean[]{true, false, false, false, true, false, false, true, false, false, false}),
                is(3));
    }

    @Test
    public void test10() {
        assertThat(
                howMuchIsTrue.countTrue(new boolean[]{true, true, false, true, false, false, false, false, true, false}),
                is(4));
    }

    @Test
    public void test11() {
        assertThat(howMuchIsTrue.countTrue(new boolean[]{true, false, true, true, false, true, true, true, true, false,
                true, false, true, false}), is(9));
    }

    @Test
    public void test12() {
        assertThat(howMuchIsTrue.countTrue(new boolean[]{true, false, true, true, true, true, false, true, true, false,
                true, false, false, false, false}), is(8));
    }

    @Test
    public void test13() {
        assertThat(
                howMuchIsTrue.countTrue(
                        new boolean[]{true, true, false, false, false, false, true, false, true, true, false, true}),
                is(6));
    }
}
