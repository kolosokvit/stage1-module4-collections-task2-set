package com.epam.mjc.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new TreeSet<>(firstSet);
        result.removeIf(s -> !secondSet.contains(s) || thirdSet.contains(s));
        for (String s : thirdSet) {
            if (!firstSet.contains(s) && !secondSet.contains(s)) {
                result.add(s);
            }
        }
        return result;
    }
}
