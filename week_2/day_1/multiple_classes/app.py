from modules.Car import *
from modules.Engine import *
from modules.Gearbox import *

engine = Engine(2)
gearBox = Gearbox(6)

car = Car("red", "Ford", engine, gearBox)

print(car.colour)
print(car.engine.volume)
print(car.engine.ignite())