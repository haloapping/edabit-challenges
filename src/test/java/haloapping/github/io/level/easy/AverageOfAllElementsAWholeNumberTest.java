package haloapping.github.io.level.easy;

import static org.hamcrest.core.Is.is;

import org.junit.Test;

import static org.junit.Assert.assertThat;

public class AverageOfAllElementsAWholeNumberTest {
    AverageOfAllElementsAWholeNumber averageOfAllElementsAWholeNumber = new AverageOfAllElementsAWholeNumber();

    @Test
    public void test1() {
        assertThat(averageOfAllElementsAWholeNumber.isAvgWhole(new int[]{3, 5, 9}), is(false));
    }

    @Test
    public void test2() {
        assertThat(averageOfAllElementsAWholeNumber.isAvgWhole(new int[]{1, 1, 1, 1}), is(true));
    }

    @Test
    public void test3() {
        assertThat(averageOfAllElementsAWholeNumber.isAvgWhole(new int[]{1, 2, 3, 4, 5}), is(true));
    }

    @Test
    public void test4() {
        assertThat(averageOfAllElementsAWholeNumber.isAvgWhole(new int[]{5, 2, 4}), is(false));
    }

    @Test
    public void test5() {
        assertThat(averageOfAllElementsAWholeNumber.isAvgWhole(new int[]{11, 22}), is(false));
    }

    @Test
    public void test6() {
        assertThat(averageOfAllElementsAWholeNumber.isAvgWhole(new int[]{4, 1, 7, 9, 2, 5, 7, 2, 4}), is(false));
    }
}
