#include <list>
#include "gtest/gtest.h"
#include "gmock/gmock.h"

using ::testing::ElementsAre;

std::list<int> PrimeFactors(int n) {
  return std::list<int>();
}

TEST(PrimeFactors, testOne) {
  ASSERT_THAT(PrimeFactors(1), ElementsAre());
}
