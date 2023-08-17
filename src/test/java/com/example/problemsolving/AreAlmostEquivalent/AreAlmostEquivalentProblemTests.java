package com.example.problemsolving.AreAlmostEquivalent;

import com.example.problemsolving.AreAlmostEquivalent.AreAlmostEquivalentProblem;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class AreAlmostEquivalentProblemTests {

    @Test
    public void testCase1(){

        List<String> s = new ArrayList<>(List.of("aabaab", "aaaaabb"));
        List<String> t = new ArrayList<>(List.of("bbabbc", "abb"));

        List<String> expected = List.of("YES", "NO");
        List<String> result = AreAlmostEquivalentProblem.areAlmostEquivalent(s, t);

        assertEquals(expected, result);

    }

    @Test
    public void testCase2(){

        List<String> s = new ArrayList<>(List.of("aaaa"));
        List<String> t = new ArrayList<>(List.of("bbbb"));

        List<String> expected = List.of("NO");
        List<String> result = AreAlmostEquivalentProblem.areAlmostEquivalent(s, t);

        assertEquals(expected, result);

    }

    @Test
    public void testCase3(){

        List<String> s = new ArrayList<>(List.of("aaa"));
        List<String> t = new ArrayList<>(List.of("bbba"));

        List<String> expected = List.of("NO");
        List<String> result = AreAlmostEquivalentProblem.areAlmostEquivalent(s, t);

        assertEquals(expected, result);

    }

    @Test
    public void testCase4(){

        List<String> s = new ArrayList<>(List.of("aabaab", "aaaaab"));
        List<String> t = new ArrayList<>(List.of("bbabbc", "abbc"));

        List<String> expected = List.of("YES", "NO");
        List<String> result = AreAlmostEquivalentProblem.areAlmostEquivalent(s, t);

        assertEquals(expected, result);

    }

}
