package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> squares = new TreeSet<>();
        for (Integer i : sourceList) {
            squares.add(i * i);
        }
        Set<Integer> result = new TreeSet<>();
        for (Integer element : squares) {
            if (element >= lowerBound && element <= upperBound) {
                result.add(element);
            }
        }
        return result;
    }
}
