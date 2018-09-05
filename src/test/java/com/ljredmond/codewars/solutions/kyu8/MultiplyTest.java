package com.ljredmond.codewars.solutions.kyu8;

import org.junit.Test;

import static org.junit.Assert.*;
import static com.ljredmond.codewars.solutions.kyu8.Multiply.multiply;

public class MultiplyTest {

  @Test
  public void timesZero() {

    assertEquals(0, multiply(0.0, 0.0), 0.0);
    assertEquals(0, multiply(1.0, 0.0), 0.0);
    assertEquals(0, multiply(10.0, 0.0), 0.0);
    assertEquals(0, multiply(0.0, 100.0), 0.0);
  }

  @Test
  public void timesOne() {

    assertEquals(1.0, multiply(1.0, 1.0), 0.0);
    assertEquals(15.0, multiply(15.0, 1.0), 0.0);
    assertEquals(15.0, multiply(1.0, 15.0), 0.0);
    assertEquals(20.0, multiply(20.0, 1.0), 0.0);
    assertEquals(100.0, multiply(100.0, 1.0), 0.0);
  }

  @Test
  public void positiveTimesNegative() {

    assertEquals(-30.0, multiply(-6.0, 5.0), 0.0);
    assertEquals(-48.0, multiply(3.0, -16.0), 0.0);
    assertEquals(-81.0, multiply(-9.0, 9.0), 0.0);
    assertEquals(-12.0, multiply(3.0, -4.0), 0.0);
  }

  @Test
  public void negativeTimesNegative() {

    assertEquals(30.0, multiply(-6.0, -5.0), 0.0);
    assertEquals(80.0, multiply(-10.0, -8.0), 0.0);
    assertEquals(1000.0, multiply(-100.0, -10.0), 0.0);
    assertEquals(600.0, multiply(-150.0, -4.0), 0.0);
  }

  @Test
  public void decimals() {

    assertEquals(30.72, multiply(6.4, 4.8), 0.0);
    assertEquals(45775.968, multiply(190.4, 240.42), 0.0);
  }
}