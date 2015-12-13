
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NthSeriesTest {

    @Test
    public void test0() {
        assertEquals(NthSeries.seriesSum(1), "1.00");
    }
    @Test
    public void test1() {
        assertEquals(NthSeries.seriesSum(5), "1.57");
    }
    @Test
    public void test2() {
        assertEquals(NthSeries.seriesSum(9), "1.77");
    }
    @Test
    public void test3() {
        assertEquals(NthSeries.seriesSum(15), "1.94");
    }
}


