package com.ljredmond.codewars.solutions.kyu6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {

  private static final int LONG_WORD_THRESHOLD = 5;

  /**
   * https://www.codewars.com/kata/5264d2b162488dc400000001
   *
   * Function that takes in a string of one or more words, and returns the same string, but with all five or more
   * letter words reversed. Strings passed in will consist of only letters and spaces. Spaces will be included only
   * when more than one word is present.
   *
   * @param sentence the sentence to spin
   * @return the sentence with all five or more letter words reversed
   */
  public static String spinWords(String sentence) {

    return Arrays.stream(sentence.split(" "))
            .map(SpinWords::spinWordIfLong)
            .collect(Collectors.joining(" "));
  }

  private static String spinWordIfLong(String word) {

    return word.length() >= LONG_WORD_THRESHOLD ? spinWord(word) : word;
  }

  private static String spinWord(String word) {

    return new StringBuilder(word).reverse().toString();
  }
}
