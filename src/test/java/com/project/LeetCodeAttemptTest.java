package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void stringMatchingInAnArrayTest() {

        String[] substringWords1 = new String[]{"mass", "as", "hero", "superhero"};
        assertArrayEquals(new String[]{"as", "hero"}, LeetCodeAttempt.stringMatchingInAnArray(substringWords1));

        String[] substringWords2 = new String[]{"leetcode","et","code"};
        assertArrayEquals(new String[]{"code", "et"}, LeetCodeAttempt.stringMatchingInAnArray(substringWords2));

        String[] substringWords3 = new String[]{"blue","green","bu"};
        assertArrayEquals(new String[]{}, LeetCodeAttempt.stringMatchingInAnArray(substringWords3));

    }

}
