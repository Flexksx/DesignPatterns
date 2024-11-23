from abc import ABC, abstractmethod

from employee.EmployeeState import EmployeeState


class Employee(ABC):
    def __init__(self, name: str = None) -> None:
        self.name = name
        self.possible_states: list[EmployeeState] = []
        self.current_state = None

    def get_name(self) -> str:
        return self.name

    @abstractmethod
    def add_state(self, state: EmployeeState):
        pass

    @abstractmethod
    def set_state(self, state: EmployeeState):
        pass

    @abstractmethod
    def get_state(self) -> EmployeeState:
        pass

    @abstractmethod
    def handle_request(self, request: dict):
        pass

    def __str__(self) -> str:
        return f"Employee: {self.name} - current state: {self.current_state}"

    def __repr__(self) -> str:
        return super().__str__()
