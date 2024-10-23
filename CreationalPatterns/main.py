from menu.Menu import Menu
from coffee.Americano import Americano
from coffee.Cappuccino import Cappuccino
from coffee.Latte import Latte
from coffee.Espresso import Espresso
from coffee.enums.DefaultCoffeeType import DefaultCoffeeType
from coffee.enums.CoffeeSize import CoffeeSize
from coffee.ingredients.CoffeeBeans import CoffeeBeans
from coffee.ingredients.MilkType import MilkType
from coffee.ingredients.Topping import Topping
from order.OrderBuilder import OrderBuilder
from coffee.creators.CoffeeFactory import CoffeeFactory

menu = Menu.get_instance()
americano = Americano()
cappuccino = Cappuccino()
latte = Latte()
espresso = Espresso()
menu.add_menu_item(americano)
menu.add_menu_item(cappuccino)
menu.add_menu_item(latte)
menu.add_menu_item(espresso)

print(menu)

order = OrderBuilder().of_type(DefaultCoffeeType.CAPPUCCINO).with_size(CoffeeSize.LARGE).with_beans(
    CoffeeBeans.ROBUSTA).with_milk(MilkType.SOY).with_topping(Topping.CINNAMON).build()

coffee_factory = CoffeeFactory()
coffee = coffee_factory.create_coffee(order)
print(order)
print(coffee)