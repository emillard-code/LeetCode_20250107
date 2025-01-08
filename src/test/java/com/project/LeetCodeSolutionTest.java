package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void stringMatchingInAnArrayTest() {

        String[] substringWords1 = new String[]{"mass", "as", "hero", "superhero"};
        assertArrayEquals(new String[]{"as", "hero"}, LeetCodeSolution.stringMatching(substringWords1).toArray());

        String[] substringWords2 = new String[]{"leetcode","et","code"};
        assertArrayEquals(new String[]{"et", "code"}, LeetCodeSolution.stringMatching(substringWords2).toArray());

        String[] substringWords3 = new String[]{"blue","green","bu"};
        assertArrayEquals(new String[]{}, LeetCodeSolution.stringMatching(substringWords3).toArray());

    }

}
