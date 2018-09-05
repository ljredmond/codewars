package com.ljredmond.codewars.solutions.kyu6;

import org.junit.Test;

import static com.ljredmond.codewars.solutions.kyu6.AreSame.comp;
import static org.junit.Assert.*;

public class AreSameTest {

  @Test
  public void falseIfEitherIsNull() {

    assertEquals(false, comp(null, null));
    assertEquals(false, comp(new int[]{}, null));
    assertEquals(false, comp(null, new int[]{}));
  }

  @Test
  public void trueIfBothEmpty() {

    assertEquals(true, comp(new int[]{}, new int[]{}));
  }

  @Test
  public void oneElementTrue() {

    assertEquals(true, comp(new int[]{2}, new int[]{4}));
    assertEquals(true, comp(new int[]{3}, new int[]{9}));
    assertEquals(true, comp(new int[]{7}, new int[]{49}));
    assertEquals(true, comp(new int[]{12}, new int[]{144}));
  }

  @Test
  public void oneElementFalse() {

    assertEquals(false, comp(new int[]{3}, new int[]{12}));
    assertEquals(false, comp(new int[]{3}, new int[]{9, 12}));
    assertEquals(false, comp(new int[]{6}, new int[]{35}));
    assertEquals(false, comp(new int[]{3}, new int[]{12}));
  }

  @Test
  public void twoElementsOutOfOrderTrue() {

    assertEquals(true, comp(new int[]{12, 8}, new int[]{64, 144}));
    assertEquals(true, comp(new int[]{4, 100}, new int[]{10000, 16}));
  }

  @Test
  public void twoElementsFalse() {

    assertEquals(false, comp(new int[]{3, 15}, new int[]{225, 225}));
    assertEquals(false, comp(new int[]{9, 16}, new int[]{81, 100}));
  }

  @Test
  public void longerTrue() {

    assertEquals(true, comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11}, new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361}));
  }

  @Test
  public void longerFalse() {

    assertEquals(false, comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11}, new int[]{132, 14641, 20736, 361, 25921, 361, 20736, 361}));
  }

  @Test
  public void handleLargeNumbers() {

    assertEquals(false, comp(new int[]{10000000}, new int[]{100000000}));
  }
}