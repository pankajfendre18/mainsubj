package com.interview.practice;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        list1.retainAll(list2); // list1 now contains only common elements

        System.out.println("Common Elements: " + list1); // Output: [21, 34, 56]
    }
}
