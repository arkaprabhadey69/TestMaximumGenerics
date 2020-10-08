package com.bl.maximumgenerics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMaximum<T extends Comparable<T>> {
    T one;
    T two;
    T three;

    public TestMaximum(T one, T two, T three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }

    public TestMaximum() {
    }

    //Method to find maximum of three numbers
    public static Integer findMax(Integer one, Integer two, Integer three) {
        Integer max = one;
        if (two.compareTo(max) > 0)
            max = two;
        if (three.compareTo(max) > 0)
            max = three;
        return max;
    }

    //Method to find maximum of three floating point numbers
    public static Float findMax(Float one, Float two, Float three) {
        Float max = one;
        if (two.compareTo(max) > 0)
            max = two;
        if (three.compareTo(max) > 0)
            max = three;
        return max;
    }

    //Method to find maximum of three strings
    public static String findMax(String one, String two, String three) {
        String max = one;
        if (two.compareTo(max) > 0)
            max = two;
        if (three.compareTo(max) > 0)
            max = three;
        return max;
    }

    //Generic Method to find max of three variables of any type
    public static <T extends Comparable<T>> T findAnyMax(T one, T two, T three) {
        T max = one;
        if (two.compareTo(max) > 0)
            max = two;
        if (three.compareTo(max) > 0)
            max = three;
        return max;
    }

    //Generic Method to find maximum of more than 3 variables of any type
    public static <T extends Comparable<T>> T findAnyMax(T... elements) {
        List<T> list = Arrays.asList(elements).stream().sorted().collect(Collectors.toList());
        return list.get(elements.length - 1);
    }

    public T findAnyMax() {
        return TestMaximum.findAnyMax(one, two, three);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to test maximum");
        System.out.println(findMax(7, 9, 10));
        System.out.println(findMax(7.24f, 2.56f, 7.23f));
        System.out.println(findAnyMax("Apple", "Peach", "Banana"));
        System.out.println(new TestMaximum<Integer>(6, 7, 8).findAnyMax());
        System.out.println(findAnyMax("Apple", "Peach", "Banana", "Zebra"));


    }

}
