package com.example.problemsolving.AreAlmostEquivalent;

import java.util.*;

public class AreAlmostEquivalentProblem {
    public static List<String> areAlmostEquivalent(List<String> s, List<String> t) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.size(); i++) {
            result.add(areStringAlmostEquivalent(s.get(i), t.get(i)));
        }
        return result;
    }

    public static String areStringAlmostEquivalent(String s, String t) {
        if (s.length() != t.length()) {
            return "NO";
        }
        Set<Character> charListA = mapArraytoSet(s.toCharArray());
        Set<Character> charListB = mapArraytoSet(t.toCharArray());

        Map<Character, List<Integer>> resultObj = occurrenceObject(charListA, charListB, s, t);


        return checkAlmostEquivalent(resultObj) ? "YES" : "NO";
    }

    public static boolean checkAlmostEquivalent(Map<Character, List<Integer>> a) {
        boolean test = true;

        for (Map.Entry<Character, List<Integer>> entry : a.entrySet()) {
            var arr = entry.getValue();
            if (Math.abs(arr.get(0) - arr.get(1)) > 3) {
                test = false;
                break; // Exit the loop early if condition is not met
            }
        }

        return test;
    }

    public static Map<Character, List<Integer>> occurrenceObject(Set<Character> set1, Set<Character> set2, String str1, String str2) {

        Map<Character, List<Integer>> obj = new HashMap<>();
        Set<Character> set = set1.size() > set2.size() ? set1 : set2;

        set.forEach(character -> {
            List<Integer> list = new ArrayList<>();
            list.add(countOccurrence(character, str1));
            list.add(countOccurrence(character, str2));
            obj.put(character, list);
        });
        return obj;
    }

    public static Set<Character> mapArraytoSet(char[] arr) {
        Set<Character> set = new HashSet<>();
        for (Character el : arr) {
            set.add(el);
        }
        return set;
    }

    public static Integer countOccurrence(Character ch, String str) {
        int count = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (ch.equals(arr[i])) count++;
        }
        return count;
    }

}