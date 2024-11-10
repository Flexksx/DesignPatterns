from coffee.enums.CoffeeSize import CoffeeSize
from coffee.enums.DefaultCoffeeType import DefaultCoffeeType
from coffee.Coffee import Coffee


class Espresso(Coffee):
    def __init__(self):
        super().__init__(name="Espresso",
                         price=1.99,
                         type=DefaultCoffeeType.ESPRESSO,
                         size=CoffeeSize.SMALL)
