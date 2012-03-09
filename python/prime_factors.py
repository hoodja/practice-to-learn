import unittest

def prime_factors(n, candidate=2):
  if n <= 1: return []
  if n % candidate != 0: return prime_factors(n, candidate + 1)
  return [candidate] + prime_factors(n / candidate, candidate)

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
