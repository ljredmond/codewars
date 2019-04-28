package com.ljredmond.codewars.solutions.kyu7;

import org.junit.Test;

import java.util.Arrays;

import static com.ljredmond.codewars.solutions.kyu7.BinaryArrayToNumber.convertBinaryArrayToInt;
import static org.junit.Assert.*;

public class BinaryArrayToNumberTest {

  @Test
  public void smallNumbers() {

    assertEquals(1, convertBinaryArrayToInt(Arrays.asList(0, 1)));
    assertEquals(1, convertBinaryArrayToInt(Arrays.asList(0, 0, 0, 1)));
    assertEquals(2, convertBinaryArrayToInt(Arrays.asList(1, 0)));
    assertEquals(4, convertBinaryArrayToInt(Arrays.asList(1, 0, 0)));
    assertEquals(7, convertBinaryArrayToInt(Arrays.asList(1, 1, 1)));
    assertEquals(10, convertBinaryArrayToInt(Arrays.asList(1, 0, 1, 0)));
  }

  @Test
  public void biggerNumbers() {

    assertEquals(32, convertBinaryArrayToInt(Arrays.asList(1, 0, 0, 0, 0, 0)));
    assertEquals(67, convertBinaryArrayToInt(Arrays.asList(1, 0, 0, 0, 0, 1, 1)));
    assertEquals(100, convertBinaryArrayToInt(Arrays.asList(1, 1, 0, 0, 1, 0, 0)));
  }

  @Test
  public void zeroPadded() {

    assertEquals(16, convertBinaryArrayToInt(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0)));
    assertEquals(100, convertBinaryArrayToInt(Arrays.asList(0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0)));
  }
}