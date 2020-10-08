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
    public static Float findMax(Float one, Float two, Float three) {
            Float max = one;
        if (two.compareTo(max) > 0)
            max = two;
        if (three.compareTo(max) > 0)
            max = three;
        return max;
    }
    public static String findMax(String one, String two, String three) {
        String max = one;
        if (two.compareTo(max) > 0)
            max = two;
        if (three.compareTo(max) > 0)
            max = three;
        return max;
    }
    public static  <T extends Comparable<T>> T findAnyMax(T one, T two, T three) {
        T max = one;
        if (two.compareTo(max) > 0)
            max = two;
        if (three.compareTo(max) > 0)
            max = three;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to test maximum");
        System.out.println(findMax(7, 9, 10));
        System.out.println(findMax(7.24f, 2.56f, 7.23f));
       // System.out.println(findMax("Apple", "Peach", "Banana"));
        System.out.println(findAnyMax("Apple", "Peach", "Banana"));


    }

}
