import unittest

def prime_factors(n):
  return []


class prime_factors_test(unittest.TestCase):

    def test_one(self):
        self.assertEqual(prime_factors(1), [])

if __name__ == '__main__':
    unittest.main()
