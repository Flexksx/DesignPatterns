from pastry.PastryBuilder import PastryBuilder
from pastry.PastryType import PastryType
from pastry.PastryWarmness import PastryWarmness
from .Order import Order


class PastryOrder(Order):
    def __init__(self, pastry_type: PastryType = None, quantity: int = None, warmness: PastryWarmness = None, use_microwave: bool = None) -> None:
        self.pastry_type = pastry_type
        self.quantity = quantity
        self.warmness = warmness
        self.use_microwave = False

    def prepare(self):
        products = []
        pastry_builder = PastryBuilder()
        for _ in range(self.quantity):
            products.append(pastry_builder.of_type(
                self.pastry_type).with_warmness(self.warmness).build())
        return products
