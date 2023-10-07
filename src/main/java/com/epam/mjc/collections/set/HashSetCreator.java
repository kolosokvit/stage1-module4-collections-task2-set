package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (Integer i : sourceList) {
            result.add(i);
            if (i % 2 == 0) {
                do {
                    result.add(i / 2);
                    i = i / 2;
                } while (i % 2 != 1);
            } else {
                result.add(i);
                result.add(2 * i);
            }
        }
        return result;
    }
}
