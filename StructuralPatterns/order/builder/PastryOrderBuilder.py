from ..PastryOrder import PastryOrder
from pastry.PastryWarmness import PastryWarmness
from pastry.PastryType import PastryType


class PastryOrderBuilder():
    def __init__(self):
        self.pastry_type = None
        self.quantity = 1
        self.warmness = PastryWarmness.COLD
        self.use_microwave = False

    def of_type(self, pastry_type: PastryType):
        self.pastry_type = pastry_type
        return self

    def with_quantity(self, quantity: int):
        self.quantity = quantity
        return self

    def with_warmness(self, warmness: PastryWarmness):
        self.warmness = warmness
        return self

    def warm(self):
        self.warmness = PastryWarmness.WARM
        return self

    def cold(self):
        self.warmness = PastryWarmness.COLD
        return self

    def hot(self):
        self.warmness = PastryWarmness.HOT
        return self

    def warm_in_microwave(self):
        self.use_microwave = True
        return self

    def build(self):
        return PastryOrder(pastry_type=self.pastry_type, quantity=self.quantity, warmness=self.warmness, use_microwave=self.use_microwave)
