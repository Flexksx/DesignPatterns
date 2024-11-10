from coffee.enums.CoffeeSize import CoffeeSize
from coffee.enums.DefaultCoffeeType import DefaultCoffeeType
from coffee.Coffee import Coffee
from coffee.ingredients.MilkType import MilkType


class Cappuccino(Coffee):
    def __init__(self):
        super().__init__(name="Cappuccino",
                         price=3.99,
                         type=DefaultCoffeeType.CAPPUCCINO,
                         milk_quantity=100.0,
                         milk_type=MilkType.WHOLE,
                         size=CoffeeSize.MEDIUM)
