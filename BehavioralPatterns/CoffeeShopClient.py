from api.coffee.CoffeeAPI import CoffeeAPI
from api.order.OrderAPI import OrderAPI
from api.pastry.PastryClient import PastryClient
from coffee.creators.builder.CoffeeBuilder import CoffeeBuilder
from employee.barista.Barista import Barista
from order.builder.OrderBuilder import OrderBuilder
from pastry.PastryFactory import PastryFactory


class CoffeeShopClient:
    def __init__(self) -> None:
        self._barista = Barista(name="John")
        self.coffee = CoffeeAPI(barista=self._barista)
        self.orders = OrderAPI(coffee_api=self.coffee)
