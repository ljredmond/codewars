package com.ljredmond.codewars.solutions.kyu6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {

  private static final int LONG_WORD_THRESHOLD = 5;

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
