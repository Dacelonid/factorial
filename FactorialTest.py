import unittest

from Factorial import Factorial


class MyTestCase(unittest.TestCase):
    def test_factorial_zero_expect_one(self):
        self.assertEqual(1, Factorial.factorial(0))

    def test_factorial_one_expect_one(self):
        self.assertEqual(1, Factorial.factorial(1))

    def test_factorial_two_expect_two(self):
        self.assertEqual(2, Factorial.factorial(2))

    def test_factorial_three_expect_six(self):
        self.assertEqual(6, Factorial.factorial(3))

    def test_factorial_ten_expect_big_number(self):
        self.assertEqual(3628800, Factorial.factorial(10))

    def test_factorial_negative_number_expect_exception(self):
        self.assertRaises(ValueError, lambda: Factorial.factorial(-1))

    def test_factorial_not_a_number_expect_exception(self):
        self.assertRaises(ValueError, lambda: Factorial.factorial("a"))


if __name__ == '__main__':
    unittest.main()
