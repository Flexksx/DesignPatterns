from employee.EmployeeState import EmployeeState
from coffee.creators.builder.CoffeeBuilder import CoffeeBuilder


class BaristaReadyState(EmployeeState):
    def __init__(self) -> None:
        super().__init__()
        self.name = "Ready"
        self.builder = CoffeeBuilder()

    def handle_request(self, request: dict):
        if request["request"] == "order":
            print("Barista is preparing the order")
        else:
            print("Barista is not ready to take the order")

    def __str__(self) -> str:
        return f"Barista state: {self.name}"

    def __repr__(self) -> str:
        return self.__str__()

    def _decode_request(self, request: dict):
        pass
