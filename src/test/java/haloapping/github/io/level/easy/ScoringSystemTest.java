package haloapping.github.io.level.easy;

import static org.hamcrest.core.Is.is;

import org.junit.Test;

import static org.junit.Assert.assertThat;

public class ScoringSystemTest {
    ScoringSystem scoringSystem = new ScoringSystem();

    @Test
    public void test1() {
        assertThat(scoringSystem.calculateScores("AAB"), is(new int[]{2, 1, 0}));
    }

    @Test
    public void test2() {
        assertThat(scoringSystem.calculateScores("ABC"), is(new int[]{1, 1, 1}));
    }

    @Test
    public void test3() {
        assertThat(scoringSystem.calculateScores("ABCBACC"), is(new int[]{2, 2, 3}));
    }

    @Test
    public void test4() {
        assertThat(scoringSystem.calculateScores("CCBBBB"), is(new int[]{0, 4, 2}));
    }

    @Test
    public void test5() {
        assertThat(scoringSystem.calculateScores("CCAABBAABBCC"), is(new int[]{4, 4, 4}));
    }

    @Test
    public void test6() {
        assertThat(scoringSystem.calculateScores("A"), is(new int[]{1, 0, 0}));
    }

    @Test
    public void test7() {
        assertThat(scoringSystem.calculateScores(""), is(new int[]{0, 0, 0}));
    }

    @Test
    public void test8() {
        assertThat(scoringSystem.calculateScores("ACCCA"), is(new int[]{2, 0, 3}));
    }
}
