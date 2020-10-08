package com.bl.maximumgenerics;


import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTest {

    @Test
    public void if_first_num_max_return_first() {
        Integer max = TestMaximum.findMax(10, 8, 9);
        Assert.assertSame(10, max);
        //Assert.assertThat(max,CoreMatchers.equalTo(10));
    }

    @Test
    public void if_second_num_max_return_second() {
        Integer max = TestMaximum.findMax(8, 10, 9);
        Assert.assertSame(10, max);
    }

    @Test
    public void if_third_num_max_return_third() {
        Integer max = TestMaximum.findMax(10, 8, 99);
        Assert.assertSame(99, max);
    }

    @Test
    public void if_first_float_max_return_first() {
        Float max = TestMaximum.findMax(10.12f, 8.34f, 9.98f);
        Assert.assertThat(max, CoreMatchers.equalTo(10.12F));
    }

    @Test
    public void if_second_float_max_return_second() {
        Float max = TestMaximum.findMax(8.99f, 10.01f, 9.00f);
        Assert.assertThat(max, CoreMatchers.equalTo(10.01F));
    }

    @Test
    public void if_third_float_max_return_third() {
        Float max = TestMaximum.findMax(8.9998f, 8.9999f, 9.0001f);
        Assert.assertThat(max, CoreMatchers.equalTo(9.0001F));
    }

}