from enum import Enum


class PastryWarmness(Enum):
    COLD = "Cold"
    WARM = "Warm"
    HOT = "Hot"

    def __str__(self):
        return self.value

    def __repr__(self):
        return self.value
