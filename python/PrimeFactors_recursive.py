import unittest

def PrimeFactors(n, candidate=2):
    if( n <= 1 ): return []
    if (n%candidate != 0): return PrimeFactors(n, candidate+1)
    return [candidate] + PrimeFactors(n/candidate, candidate)

class PrimeFactorsTest(unittest.TestCase):
    def testOne(self):
        self.assertEqual(PrimeFactors(1), [])

    def testTwo(self):
        self.assertEqual(PrimeFactors(2), [2])

    def testThree(self):
        self.assertEqual(PrimeFactors(3), [3])

    def testFour(self):
        self.assertEqual(PrimeFactors(4), [2,2])

    def testSix(self):
        self.assertEqual(PrimeFactors(6), [2,3])

    def testEight(self):
        self.assertEqual(PrimeFactors(8), [2,2,2])

    def testNine(self):
        self.assertEqual(PrimeFactors(9), [3,3])
if __name__ == '__main__':
    unittest.main()