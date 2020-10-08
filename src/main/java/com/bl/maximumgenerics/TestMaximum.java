package com.bl.maximumgenerics;

public class TestMaximum {

    public static Integer findMax(Integer one, Integer two, Integer three) {
        Integer max = one;
        if (two.compareTo(max) > 0)
            max = two;
        if (three.compareTo(max) > 0)
            max = three;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to test maximum");
        System.out.println(findMax(7, 9, 10));
    }

}
