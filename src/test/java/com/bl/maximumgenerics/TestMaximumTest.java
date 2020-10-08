package com.bl.maximumgenerics;


import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTest {

    @Test
    public void if_first_num_max_return_first() {
        TestMaximum t = new TestMaximum();
        Integer max = t.findMax(10, 8, 9);
        Assert.assertSame(10, max);
    }

    @Test
    public void if_second_num_max_return_second() {
        TestMaximum t = new TestMaximum();
        Integer max = t.findMax(10, 81, 9);
        Assert.assertSame(81, max);
    }

    @Test
    public void if_third_num_max_return_third() {
        TestMaximum t = new TestMaximum();
        Integer max = t.findMax(10, 8, 99);
        Assert.assertSame(99, max);
    }


}