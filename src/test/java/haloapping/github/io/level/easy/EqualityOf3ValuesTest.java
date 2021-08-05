package haloapping.github.io.level.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EqualityOf3ValuesTest {
    EqualityOf3Values equalityOf3Values = new EqualityOf3Values();

    @Test
    public void test1() {
        assertEquals(0, equalityOf3Values.equal(2, 3, 4));
    }

    @Test
    public void test2() {
        assertEquals(0, equalityOf3Values.equal(1, 7, 6));
    }

    @Test
    public void test3() {
        assertEquals(0, equalityOf3Values.equal(7, 3, 4));
    }

    @Test
    public void test4() {
        assertEquals(2, equalityOf3Values.equal(3, 3, 6));
    }

    @Test
    public void test5() {
        assertEquals(2, equalityOf3Values.equal(7, 3, 7));
    }

    @Test
    public void test6() {
        assertEquals(3, equalityOf3Values.equal(1, 1, 1));
    }

    @Test
    public void test7() {
        assertEquals(3, equalityOf3Values.equal(7, 7, 7));
    }

    @Test
    public void test8() {
        assertEquals(3, equalityOf3Values.equal(4, 4, 4));
    }
}
