package com.ljredmond.codewars.solutions.kyu6;

import org.junit.Test;

import static com.ljredmond.codewars.solutions.kyu6.EqualSidesOfAnArray.findEvenIndex;
import static org.junit.Assert.*;

public class EqualSidesOfAnArrayTest {

  @Test
  public void oneElement() {

    assertEquals(0, findEvenIndex(new int[]{1}));
    assertEquals(0, findEvenIndex(new int[]{100}));
    assertEquals(0, findEvenIndex(new int[]{0}));
  }

  @Test
  public void allZeros() {

    assertEquals(0, findEvenIndex(new int[]{0, 0, 0, 0, 0, 0, 0}));
  }

  @Test
  public void beginning() {

    assertEquals(0, findEvenIndex(new int[]{20, 10, -80, 10, 10, 15, 35}));
  }

  @Test
  public void middle() {

    assertEquals(3, findEvenIndex(new int[]{1, 2, 3, 4, 3, 2, 1}));
  }

  @Test
  public void end() {

    assertEquals(6, findEvenIndex(new int[]{10, 20, -25, 35, -10, -30, 20}));
  }
}