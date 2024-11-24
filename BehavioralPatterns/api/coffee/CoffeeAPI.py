from coffee.creators.builder.CoffeeBuilder import CoffeeBuilder
from coffee.enums.BeanType import BeanType
from coffee.enums.MilkType import MilkType
from coffee.enums.SyrupType import SyrupType


class CoffeeAPI:
    def __init__(self) -> None:
        self._coffee_builder = CoffeeBuilder()

    def get(
        self,
        milk: MilkType = None,
        bean: BeanType = None,
        syrup: SyrupType = None,
        take_out: bool = False,
    ):
        return (
            self._coffee_builder.with_milk(milk)
            .with_bean(bean)
            .with_syrup(syrup)
            .for_take_out(take_out)
            .build()
        )
