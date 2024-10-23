from menu.menu_item.enums.MenuItemType import MenuItemType
import copy


class MenuItem():
    def __init__(self, name: str = None, price: float = None, menu_item_type: MenuItemType = None) -> None:
        self._name = name
        self._price = price
        self._menu_item_type = menu_item_type

    @property
    def name(self):
        return self._name

    @property
    def price(self):
        return self._price

    @property
    def menu_item_type(self):
        """The menu_item_type property."""
        return self._menu_item_type

    def clone(self):
        return copy.deepcopy(self)

    def __repr__(self) -> str:
        return f"{self._name} - {self._price} - {self._menu_item_type}"
