package com.ljredmond.codewars.solutions.kyu6;

import org.junit.Test;

import static com.ljredmond.codewars.solutions.kyu6.SpinWords.spinWords;
import static org.junit.Assert.*;

public class SpinWordsTest {

  @Test
  public void example() {

    assertEquals("Stop gninnipS My sdroW", spinWords("Stop Spinning My Words"));
  }

  @Test
  public void allShort() {

    assertEquals("this has no word that is long", spinWords("this has no word that is long"));
  }

  @Test
  public void allLong() {

    assertEquals("elpmaxe ecnetnes gniniatnoc yhtgnel sdrow", spinWords("example sentence containing lengthy words"));
  }

  @Test
  public void capitalization() {

    assertEquals("this eCnetNes stSisnoc oF yLmoDnar deZilaTipac SretTel", spinWords("this seNtenCe consiSts oF ranDomLy capiTaliZed leTterS"));
  }
}