from menu.MenuItem import MenuItem
from .PastryType import PastryType


class Pastry(MenuItem):
    def __init__(self, name: str = None, price: float = None, pastry_type: PastryType = None, temperature: float = None) -> None:
        super().__init__(name, price)
        self.pastry_type = pastry_type
        self.temperature = temperature

    def __str__(self) -> str:
        return f"""{self.pastry_type} - {self.temperature}°C"""

    def __repr__(self) -> str:
        return self.__str__()
