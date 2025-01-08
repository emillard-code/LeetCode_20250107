package com.project.attempt;

import java.util.Arrays;
import java.util.HashSet;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(stringMatchingInAnArray(new String[]{"mass", "as", "hero", "superhero"})));
        System.out.println(Arrays.toString(stringMatchingInAnArray(new String[]{"leetcode","et","code"})));
        System.out.println(Arrays.toString(stringMatchingInAnArray(new String[]{"blue","green","bu"})));

    }

    public static String[] stringMatchingInAnArray(String[] words) {

        HashSet<String> substringSet = new HashSet<>();

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words.length; j++) {

                if (words[i].contains(words[j]) && !words[i].equals(words[j])) {
                    substringSet.add(words[j]);
                }

            }

        }

        String[] substringWords = new String[substringSet.size()];
        substringSet.toArray(substringWords);

        return substringWords;

    }

}
