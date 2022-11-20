import unittest

from classes.motorbike import Motorbike

class Motorbike(Vehicle):
    def start_engine(self):
        supers_start_val = super().start_engine()
        print(supers_start_val)
        return "Vrrmmm"

    def setUp(self):
        self.motorbike = Motorbike()

    def test_motorbike_can_start_engine(self):
        self.assertEqual("Vrrmmm", self.motorbike.start_engine())
