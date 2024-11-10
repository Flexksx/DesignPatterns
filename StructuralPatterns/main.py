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
from order.builder.PastryOrderBuilder import PastryOrderBuilder
from order.builder.CoffeeOrderBuilder import CoffeeOrderBuilder
from order.builder.CompositeOrderBuilder import CompositeOrderBuilder
from coffee.creators.CoffeeFactory import CoffeeFactory
from pastry.Pastry import Pastry
from pastry.PastryType import PastryType
from pastry.PastryWarmness import PastryWarmness

menu = Menu.get_instance()
americano = Americano()
cappuccino = Cappuccino()
latte = Latte()
espresso = Espresso()
croissant = Pastry("Chocolate Croisant", 2.5,
                   PastryType.CROISSANT, PastryWarmness.WARM)
menu.add_menu_item(americano)
menu.add_menu_item(cappuccino)
menu.add_menu_item(latte)
menu.add_menu_item(espresso)
menu.add_menu_item(croissant)
coffee_factory = CoffeeFactory()

print(menu)

custom_order = CoffeeOrderBuilder().of_type(DefaultCoffeeType.CAPPUCCINO).with_size(CoffeeSize.LARGE).with_beans(
    CoffeeBeans.ROBUSTA).with_milk(MilkType.SOY).with_topping(Topping.CINNAMON).build()
print(custom_order)
custom_coffee = custom_order.prepare()
print(custom_coffee)


big_order = CompositeOrderBuilder().add_order(CoffeeOrderBuilder().of_type(DefaultCoffeeType.CAPPUCCINO).with_size(
    CoffeeSize.LARGE).with_beans(CoffeeBeans.ARABICA).build()).add_order(PastryOrderBuilder().of_type(PastryType.CROISSANT).hot().build()).build()

products = big_order.prepare()

print(products)
