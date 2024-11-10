from coffee.enums.CoffeeSize import CoffeeSize
from coffee.enums.DefaultCoffeeType import DefaultCoffeeType
from coffee.Coffee import Coffee


class Americano(Coffee):
    def __init__(self):
        super().__init__(name="Americano",
                         price=2.99,
                         type=DefaultCoffeeType.AMERICANO,
                         size=CoffeeSize.MEDIUM)
