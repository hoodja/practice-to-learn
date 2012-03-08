package com.pillartechnology.practice;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static java.util.Arrays.asList;

import java.util.List;
import java.util.ArrayList;
import org.junit.Test;

public class PrimeFactors {

  public static List<Integer> generate(int n) {
    return null;
  }

  @Test
  public void testOne() {
    assertThat(generate(1), is(list()));
  }

  private List<Integer> list(int... ints) {
    List<Integer> result = new ArrayList<Integer>();
    for (int i : ints) {
      result.add(i);
    }
    return result;
  }
}
      
