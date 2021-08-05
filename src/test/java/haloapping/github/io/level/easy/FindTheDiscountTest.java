package haloapping.github.io.level.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindTheDiscountTest {
    FindTheDiscount findTheDiscount = new FindTheDiscount();

    @Test
    public void test01() {
        assertEquals(25, findTheDiscount.discount(100, 75), 5);
    }

    @Test
    public void test02() {
        assertEquals(105.5, findTheDiscount.discount(211, 50), 5);
    }

    @Test
    public void test03() {
        assertEquals(231.27, findTheDiscount.discount(593, 61), 5);
    }

    @Test
    public void test04() {
        assertEquals(338.6, findTheDiscount.discount(1693, 80), 5);
    }

    @Test
    public void test05() {
        assertEquals(630, findTheDiscount.discount(700, 10), 5);
    }
}
