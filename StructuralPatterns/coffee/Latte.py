from coffee.enums.CoffeeSize import CoffeeSize
from coffee.enums.DefaultCoffeeType import DefaultCoffeeType
from coffee.Coffee import Coffee
from coffee.ingredients.MilkType import MilkType


class Latte(Coffee):
    def __init__(self):
        super().__init__(name="Latte",
                         price=2.99,
                         type=DefaultCoffeeType.LATTE,
                         milk_quantity=200.0,
                         milk_type=MilkType.WHOLE,
                         size=CoffeeSize.MEDIUM)
