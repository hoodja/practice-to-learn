import unittest

def prime_factors(n):
  primes = []
  candidate = 2
  while n > 1:
    while n % candidate == 0:
      primes.append(candidate)
      n = n / candidate
    candidate = candidate + 1
  if n > 1:
    primes.append(n)
  return primes


class prime_factors_test(unittest.TestCase):

    def test_one(self):
        self.assertEqual(prime_factors(1), [])

    def test_two(self):
        self.assertEqual(prime_factors(2), [2])

    def test_three(self):
        self.assertEqual(prime_factors(3), [3])

    def test_four(self):
        self.assertEqual(prime_factors(4), [2, 2])

    def test_six(self):
        self.assertEqual(prime_factors(6), [2, 3])

    def test_eight(self):
        self.assertEqual(prime_factors(8), [2, 2, 2])

    def test_nine(self):
        self.assertEqual(prime_factors(9), [3, 3])

if __name__ == '__main__':
    unittest.main()
