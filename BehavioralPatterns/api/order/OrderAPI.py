from api.coffee.CoffeeAPI import CoffeeAPI
from coffee.enums.BeanType import BeanType
from coffee.enums.MilkType import MilkType
from coffee.enums.SyrupType import SyrupType
from employee.barista.Barista import Barista
from order.Order import Order
from pastry.enums.PastryType import PastryType


class OrderAPI:
    def __init__(self, coffee_api:CoffeeAPI) -> None:
        self.coffee_api = None

    def new(self) -> Order:
        return Order()

    def add_coffee(
        self,
        order: Order = None,
        milk: MilkType = None,
        beans: BeanType = BeanType.ARABICA,
        syrup: SyrupType = None,
        to_go: bool = True,
    ) -> Order:
        if order is None:
            print("It is required to have an order to add a coffee item")
        else:
            

    def add_pastry(self, order: Order = None, pastry_type: PastryType = None) -> Order:
        if order is None:
            print("It is required to have an order to add a pastry item")
        if pastry_type is None:
            print("It is required to specify a pastry type")
