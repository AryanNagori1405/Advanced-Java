package com.aryan.Recursion;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        permutation("", "abc");

//        System.out.println(permutationList("", "abc"));

//        System.out.println(permutationCount("", "abc"));

//        System.out.println(permutationCountInArg("", "abc", 0));
    }

    private static void permutation(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
//            String second = processed.substring(i, processed.length());
            String second = processed.substring(i);
            permutation(first + ch + second, unprocessed.substring(1));
        }
    }

    private static ArrayList<String> permutationList(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        char ch = unprocessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
//            String second = processed.substring(i, processed.length());
            String second = processed.substring(i);
            ans.addAll(permutationList(first + ch + second, unprocessed.substring(1)));
        }
        return ans;
    }

    private static int permutationCount(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = unprocessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
//            String second = processed.substring(i, processed.length());
            String second = processed.substring(i);
            count += permutationCount(first + ch + second, unprocessed.substring(1));
        }
        return count;
    }

    private static int permutationCountInArg(String processed, String unprocessed, int count) {
        if (unprocessed.isEmpty()) {
            return count + 1;
        }
        char ch = unprocessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
//            String second = processed.substring(i, processed.length());
            String second = processed.substring(i);
            count = permutationCountInArg(first + ch + second, unprocessed.substring(1), count);
        }
        return count;
    }
}
