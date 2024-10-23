from menu.Menu import Menu
from menu.menu_item import MenuItem, MenuItemType

menu = Menu.get_instance()

chicken_wings = MenuItem("Chicken Wing", 2.00, "FOOD")
menu.add_menu_item(chicken_wings)

print(menu)
