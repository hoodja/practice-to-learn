#include <list>
#include "gtest/gtest.h"
#include "gmock/gmock.h"

using ::testing::ElementsAre;

std::list<int> PrimeFactors(int n) {
  std::list<int> primes;
  if (n > 1) {
    if (n % 2 == 0) {
      primes.push_back(2);
      n /= 2;
    }
    if (n > 1) {
      primes.push_back(n);
    }
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

