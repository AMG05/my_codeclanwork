import unittest
from modules.compare import compare

class CompareTest(unittest.TestCase):
    def test_3_is_greater_than_2(self):
        user_input = 3
        computer_input = 2
        actual_output = compare(3, 2)
        expected_output = "3 is greater than my number"
        self.assertEqual(expected_output, actual_output)

    def test_5_is_less_than_6(self):
        user_input = 5
        computer_input = 6
        actual_output = compare(5, 6)
        expected_output = "5 is less than my number"
        self.assertEqual(expected_output, actual_output)

    def test_if_number_is_the_same(self):
        user_input = 7
        computer_input = 7
        actual_output = compare(7, 7)
        expected_output = "You have guessed correctly"
        self.assertEqual(expected_output, actual_output)