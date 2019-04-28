package com.ljredmond.codewars.solutions.kyu6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AreSame {

  /**
   * https://www.codewars.com/kata/550498447451fbbd7600041c
   *
   * Checks if a and b are the 'same'
   *
   * Here, same means (from problem description): "the elements in b are the elements in a squared, regardless of
   * the order."
   * @param a the first integer array
   * @param b the second integer array
   * @return true if each element of b can be written as the square of a unique element in a, otherwise false
   */
  public static boolean comp(int[] a, int[] b) {

    if (a == null || b == null || a.length != b.length) return false;

    int length = a.length; // or b.length

    if (length == 0) return true;

    Map<Integer, Integer> countsOfB = new HashMap<>();

    // build a map where the keys are the elements of b, and the values are the number of times each element occurs
    Arrays.stream(b)
            .forEach(num -> countsOfB.compute(num, (number, count) -> count == null ? 1 : count + 1));

    // map each element of a to its square, and decrement the count for each square
    Arrays.stream(a)
            .map(num -> num * num)
            .forEach(square -> countsOfB.computeIfPresent(square, (number, count) -> count - 1));

    // the arrays are 'same' if and only if the counts are all 0
    return countsOfB.values().stream()
            .allMatch(count -> count == 0);
  }
}