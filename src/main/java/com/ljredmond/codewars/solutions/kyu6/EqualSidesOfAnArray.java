package com.ljredmond.codewars.solutions.kyu6;

import java.util.Arrays;

public class EqualSidesOfAnArray {

  /**
   * https://www.codewars.com/kata/5679aa472b8f57fb8c000047
   *
   * Given an integer array, finds the lowest index of an element such that the sum of the elements to its left equals
   * the sum of the elements to its right, or -1 if there is no such element.
   *
   * ex.) [1, 2, 3, 4, 3, 2, 1] -> 3
   *
   * @param arr the array to search, where 0 < arr.length < 1000
   * @return the lowest index of an element such that the sum of the element to its left equals the sum of the elements
   *  to its right, or -1 if there is no such element
   */
  public static int findEvenIndex(int[] arr) {

    int leftSum = 0;
    int rightSum = Arrays.stream(arr).sum();

    for (int i = 0; i < arr.length; i++) {

      rightSum -= arr[i];

      if (leftSum == rightSum) return i;

      leftSum += arr[i];
    }

    return -1;
  }
}