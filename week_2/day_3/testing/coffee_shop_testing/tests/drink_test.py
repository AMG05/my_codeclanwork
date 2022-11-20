import unittest
from src.Drink import Drink

class TestDrink(unittest.TestCase):
   
    def setUp(self):
        self.drink = Drink("Coke", 100)

    def test_get_drink(self):
        self.assertEqual("Coke", self.Drink.drink)

    def test_reduce_money(self):
        

   