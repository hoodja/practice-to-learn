package com.pillartechnology.practice;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static java.util.Arrays.asList;

import java.util.List;
import java.util.ArrayList;
import org.junit.Test;

public class PrimeFactors {

  public static List<Integer> generate(int n) {
    List<Integer> primes = new ArrayList<Integer>();

    for (int candidate = 2; n > 1; candidate++)
      for (; n % candidate == 0; n /= candidate)
        primes.add(candidate);

    return primes;
  }

  @Test
  public void testOne() {
    assertThat(generate(1), is(list()));
  }

  @Test
  public void testTwo() {
    assertThat(generate(2), is(list(2)));
  }

  @Test
  public void testThree() {
    assertThat(generate(3), is(list(3)));
  }

  @Test
  public void testFour() {
    assertThat(generate(4), is(list(2, 2)));
  }

  @Test
  public void testSix() {
    assertThat(generate(6), is(list(2, 3)));
  }

  @Test
  public void testEight() {
    assertThat(generate(8), is(list(2, 2, 2)));
  }

  @Test
  public void testNine() {
    assertThat(generate(9), is(list(3, 3)));
  }

  private List<Integer> list(int... ints) {
    List<Integer> result = new ArrayList<Integer>();
    for (int i : ints) {
      result.add(i);
    }
    return result;
  }
}
      
