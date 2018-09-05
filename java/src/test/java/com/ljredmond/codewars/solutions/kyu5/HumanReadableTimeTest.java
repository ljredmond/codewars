package com.ljredmond.codewars.solutions.kyu5;

import org.junit.Test;

import static com.ljredmond.codewars.solutions.kyu5.HumanReadableTime.makeReadable;
import static org.junit.Assert.*;

public class HumanReadableTimeTest {

  @Test
  public void zero() {

    assertEquals("00:00:00", makeReadable(0));
  }

  @Test
  public void oneSecond() {

    assertEquals("00:00:01", makeReadable(1));
  }

  @Test
  public void oneMinute() {

    assertEquals("00:01:00", makeReadable(60));
  }

  @Test
  public void oneHour() {

    assertEquals("01:00:00", makeReadable(3600));
  }

  @Test
  public void twentyFourHoursThirtyMinutesAnd15Seconds() {

    assertEquals("24:30:15", makeReadable(88215));
  }

  @Test
  public void max() {

    assertEquals("99:59:59", makeReadable(359999));
  }
}