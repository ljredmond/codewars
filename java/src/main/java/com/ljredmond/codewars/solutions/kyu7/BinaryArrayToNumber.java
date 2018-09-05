package com.ljredmond.codewars.solutions.kyu7;

import java.util.List;

public class BinaryArrayToNumber {

  /**
   * https://www.codewars.com/kata/578553c3a1b8d5c40300037c
   *
   * Converts a list of one's and zero's to the integer value
   *
   * ex.) [0, 0, 0, 1] -> 1
   * ex.) [1, 1, 0, 1] -> 13
   *
   * @param binary the list of bits
   * @return the equivalent integer value
   */
  public static int convertBinaryArrayToInt(List<Integer> binary) {

    int factor = 1;
    int result = 0;

    for (int i = binary.size() - 1; i >= 0; i--) {
      result += factor * binary.get(i);
      factor *= 2;
    }

    return result;
  }
}
