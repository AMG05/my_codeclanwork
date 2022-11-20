import unittest
from src.Coffee_shop import Coffee

class TestCoffeShop(unittest.TestCase):
   
    def setUp(self):
        self.coffee = Coffee("Starbucks", 1000)

    def test_coffee_shop_has_name(self):
        self.assertEqual("Starbucks", self.coffee.name)

    # def (self):
    #     self.assertEqual("The Prancing Pony", self.pub.name)

    def test_coffee_shop_has_till(self):
        self.assertEqual(1000, self.coffee.till)

    def test_get_drink(self):
        self.drink

    
    
