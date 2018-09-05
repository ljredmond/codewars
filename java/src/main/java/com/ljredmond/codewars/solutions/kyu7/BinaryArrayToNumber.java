package com.ljredmond.codewars.solutions.kyu7;

import java.util.List;

public class BinaryArrayToNumber {

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
