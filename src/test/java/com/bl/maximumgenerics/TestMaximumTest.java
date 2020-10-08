package com.bl.maximumgenerics;


import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.nio.channels.FileLock;

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
    @Test
    public void if_first_string_max_return_first() {
        String max = TestMaximum.findMax("Peach", "Apple", "Banana");
        Assert.assertThat(max, CoreMatchers.equalTo("Peach"));
    }

    @Test
    public void if_second_string_max_return_second() {
        String max = TestMaximum.findMax("Apple", "Peach", "Banana");
        Assert.assertThat(max, CoreMatchers.equalTo("Peach"));
    }

    @Test
    public void if_third_string_max_return_third() {
        String max = TestMaximum.findMax("Apple", "Banana", "Peach");
        Assert.assertThat(max, CoreMatchers.equalTo("Peach"));
    }
    @Test
    public void if_any_type_max_return_true_float() {
        Float max = TestMaximum.findAnyMax(10.12f, 8.34f, 9.98f);
        Assert.assertThat(max, CoreMatchers.equalTo(10.12F));
    }
    @Test
    public void if_any_type_max_return_true_string() {
        String max = TestMaximum.findAnyMax("Apple", "Banana", "Peach");
        Assert.assertThat(max, CoreMatchers.equalTo("Peach"));
    }
    @Test
    public void if_any_type_max_return_true_integer() {
        Integer max = TestMaximum.findAnyMax(8, 10, 9);
        Assert.assertThat(max, CoreMatchers.equalTo(10));
    }
    @Test
    public void if_any_type_max_return_true_integer_generic_class() {
        Integer max = new TestMaximum<Integer>(6, 7, 8).findAnyMax();
        Assert.assertThat(max, CoreMatchers.equalTo(8));
    }
    @Test
    public void if_any_type_max_return_true_float_generic_class() {
        Float max = new TestMaximum<Float>(6.33f, 7.52f, 7.51f).findAnyMax();
        Assert.assertThat(max, CoreMatchers.equalTo(7.52F));
    }
    @Test
    public void if_any_type_max_return_true_string_generic_class() {
        String max = new TestMaximum<String>("Cheetah", "Jaguar", "Lion").findAnyMax();
        Assert.assertThat(max, CoreMatchers.equalTo("Lion"));
    }
    @Test
    public void if_string_max_return_third_multi_parameter() {
        String max = TestMaximum.findAnyMax("Apple", "Banana", "Peach","Zebra");
        Assert.assertThat(max, CoreMatchers.equalTo("Zebra"));
    }
    @Test
    public void if_integer_max_return_third_multi_parameter() {
        Integer max = TestMaximum.findAnyMax(41,42,43,87,31,78);
        Assert.assertThat(max, CoreMatchers.equalTo(87));
    }
    @Test
    public void if_float_max_return_third_multi_parameter() {
        Float max = TestMaximum.findAnyMax(41.44f,42.55f,43.90f,87.89f,31.11f);
        Assert.assertThat(max, CoreMatchers.equalTo(87.89F));
    }





}