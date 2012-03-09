import unittest

def prime_factors(n):
  primes = []
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

if __name__ == '__main__':
    unittest.main()
