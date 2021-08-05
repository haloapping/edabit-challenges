package haloapping.github.io.level.easy;

import static org.hamcrest.core.Is.is;

import org.junit.Test;

import static org.junit.Assert.assertThat;

public class DifferenceOfMaxAndMinNumbersInArrayTest {
    DifferenceOfMaxAndMinNumbersInArray differenceOfMaxAndMinNumbersInArray = new DifferenceOfMaxAndMinNumbersInArray();

    @Test
    public void test1() {
        assertThat(differenceOfMaxAndMinNumbersInArray.differenceMaxMin(new int[]{10, 4, 1, 2, 8, 91}), is(90));
    }

    @Test
    public void test2() {
        assertThat(differenceOfMaxAndMinNumbersInArray.differenceMaxMin(new int[]{-70, 43, 34, 54, 22}), is(124));
    }
}
