from CoffeeShopClient import CoffeeShopClient
from employee.barista.Barista import Barista
from coffee.enums.BeanType import BeanType
from coffee.enums.MilkType import MilkType
from coffee.enums.SyrupType import SyrupType


barista = Barista(name="John")

api = CoffeeShopClient()

coffee = api.coffee.make(
    milk=MilkType.REGULAR, bean=BeanType.ARABICA, syrup=SyrupType.VANILLA, take_out=True
)
order = api.orders.new()
order = api.orders.add_coffee(
    order=order,
    milk=MilkType.REGULAR,
    bean=BeanType.ARABICA,
    syrup=SyrupType.VANILLA,
    to_go=True,
)
print(order.show())
