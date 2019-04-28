package com.ljredmond.codewars.solutions.kyu5;

public class HumanReadableTime {

  private static final String FORMAT_STRING = "%02d:%02d:%02d";

  /**
   * https://www.codewars.com/kata/52685f7382004e774f0001f7
   *
   * Formats a given number of seconds into a human readable format (HH:MM:SS), where:
   *
   *  HH = hours, padded to 2 digits, range 00 - 99
   *  MM = minutes, padded to 2 digits, range 00 - 59
   *  SS = seconds, padded to 2 digits, range 00 - 59
   *
   * The given input will never exceed 359999 (99:59:59)
   *
   * @param seconds the number of seconds to format
   * @return the human readable formatted string
   */
  public static String makeReadable(int seconds) {

    if (seconds > 359999) throw new IllegalArgumentException("too many seconds");

    int hours = seconds / 3600;
    seconds = seconds % 3600;

    int minutes = seconds / 60;
    seconds = seconds % 60;

    return String.format(FORMAT_STRING, hours, minutes, seconds);
  }
}