from api.coffee.CoffeeClient import CoffeeClient
from api.pastry.PastryClient import PastryClient
from coffee.creators.builder.CoffeeBuilder import CoffeeBuilder
from order.builder.OrderBuilder import OrderBuilder
from pastry.PastryFactory import PastryFactory


class CoffeeShop():
    def __init__(self) -> None:
        self.coffee = CoffeeClient()
        self.pastry = PastryClient()
