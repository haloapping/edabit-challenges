package haloapping.github.io.level.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {
    ReverseString reverseString = new ReverseString();

    @Test
    public void test1() {
        assertEquals("Think different.", reverseString.reverse(".tnereffid knihT"));
    }

    @Test
    public void test2() {
        assertEquals(reverseString.reverse("Think different."), ".tnereffid knihT");
    }

    @Test
    public void test3() {
        assertEquals(reverseString.reverse("It doesn’t make sense to hire smart people and tell them what to do; we hire smart people so they can tell us what to do."), ".od ot tahw su llet nac yeht os elpoep trams erih ew ;od ot tahw meht llet dna elpoep trams erih ot esnes ekam t’nseod tI");
    }

    @Test
    public void test4() {
        assertEquals(reverseString.reverse("Innovation is the ability to see change as an opportunity - not a threat"), "taerht a ton - ytinutroppo na sa egnahc ees ot ytiliba eht si noitavonnI");
    }

    @Test
    public void test5() {
        assertEquals(reverseString.reverse("Everything is based on a simple rule: Quality is the best business plan."), ".nalp ssenisub tseb eht si ytilauQ :elur elpmis a no desab si gnihtyrevE");
    }

    @Test
    public void test6() {
        assertEquals(reverseString.reverse("The people who are crazy enough to think they can change the world are the ones who do."), ".od ohw seno eht era dlrow eht egnahc nac yeht kniht ot hguone yzarc era ohw elpoep ehT");
    }

    @Test
    public void test7() {
        assertEquals(reverseString.reverse("Don’t let the noise of others’ opinions drown out your own inner voice."), ".eciov renni nwo ruoy tuo nword snoinipo ’srehto fo esion eht tel t’noD");
    }

    @Test
    public void test8() {
        assertEquals(reverseString.reverse("Learn continually; There's always one more thing to learn."), ".nrael ot gniht erom eno syawla s'erehT ;yllaunitnoc nraeL");
    }

    @Test
    public void test9() {
        assertEquals(reverseString.reverse("Quality is more important than quantity. One home run is much better than two doubles."), ".selbuod owt naht retteb hcum si nur emoh enO .ytitnauq naht tnatropmi erom si ytilauQ");
    }

    @Test
    public void test10() {
        assertEquals(reverseString.reverse("Your time is limited so don't waste it living someone else's life."), ".efil s'esle enoemos gnivil ti etsaw t'nod os detimil si emit ruoY");
    }

    @Test
    public void test11() {
        assertEquals(reverseString.reverse("The only way to be truly satisfied is to do what you believe is great work."), ".krow taerg si eveileb uoy tahw od ot si deifsitas ylurt eb ot yaw ylno ehT");
    }
}
