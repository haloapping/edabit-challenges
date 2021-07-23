package haloapping.github.io.level.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetWordCountTest {
    GetWordCount getWordCount = new GetWordCount();

    @Test
    public void test1() {
        assertEquals(3, getWordCount.countWords("It's high noon"));
    }

    @Test
    public void test2() {
        assertEquals(4, getWordCount.countWords("Is this easy mode"));
    }

    @Test
    public void test3() {
        assertEquals(5, getWordCount.countWords("What an easy task, right"));
    }

    @Test
    public void test4() {
        assertEquals(4, getWordCount.countWords("This is a test"));
    }

    @Test
    public void test5() {
        assertEquals(6, getWordCount.countWords("Just an example here move along"));
    }

    @Test
    public void test6() {
        assertEquals(4, getWordCount.countWords("How are you today?"));
    }
}
