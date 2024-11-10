from apparatuses.HeatingAdapter import HeatingAdapter
from apparatuses.HeatingApparatus import HeatingApparatus
from pastry.PastryWarmness import PastryWarmness
from pastry.PastryType import PastryType
from pastry.Pastry import Pastry


class PastryBuilder:
    def __init__(self):
        self.pastry = Pastry()

    def of_type(self, pastry_type: PastryType):
        print("PastryBuilder: Building a pastry of type", pastry_type)
        self.pastry.pastry_type = pastry_type
        return self

    def with_warmness(self, warmness: PastryWarmness):
        print("PastryBuilder: Setting warmness to", warmness)
        self.heating_adapter = HeatingAdapter()
        if warmness == PastryWarmness.WARM:
            self.pastry = self.heating_adapter.warm(
                HeatingApparatus.MICROWAVE, self.pastry)
            print(self.pastry)
        elif warmness == PastryWarmness.HOT:
            self.pastry = self.heating_adapter.hot(self.pastry)
            print(self.pastry)
        return self

    def build(self):
        return self.pastry
