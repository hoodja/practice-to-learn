#include <list>
#include "gtest/gtest.h"
#include "gmock/gmock.h"

using ::testing::ElementsAre;

std::list<int> PrimeFactors(int n) {
  std::list<int> primes;
  int candidate = 2;
  while (n > 1) {
    while (n % candidate == 0) {
      primes.push_back(candidate);
      n /= candidate;
    }
    candidate++;
  }
  if (n > 1) {
    primes.push_back(n);
  }
  return primes;
}

TEST(PrimeFactors, testOne) {
  ASSERT_THAT(PrimeFactors(1), ElementsAre());
}

TEST(PrimeFactors, testTwo) {
  ASSERT_THAT(PrimeFactors(2), ElementsAre(2));
}

TEST(PrimeFactors, testThree) {
  ASSERT_THAT(PrimeFactors(3), ElementsAre(3));
}

TEST(PrimeFactors, testFour) {
  ASSERT_THAT(PrimeFactors(4), ElementsAre(2, 2));
}

TEST(PrimeFactors, testSix) {
  ASSERT_THAT(PrimeFactors(6), ElementsAre(2, 3));
}

TEST(PrimeFactors, testEight) {
  ASSERT_THAT(PrimeFactors(8), ElementsAre(2, 2, 2));
}

TEST(PrimeFactors, testNine) {
  ASSERT_THAT(PrimeFactors(9), ElementsAre(3, 3));
}

