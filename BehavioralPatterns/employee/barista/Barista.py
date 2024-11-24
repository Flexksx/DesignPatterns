from employee.Employee import Employee
from employee.EmployeeState import EmployeeState
from employee.barista.BaristaBreakState import BaristaBreakState
from employee.barista.BaristaReadyState import BaristaReadyState


class Barista(Employee):
    def __init__(self, name: str = None) -> None:
        super().__init__(name)
        self.add_state(key="ready", state=BaristaReadyState())
        self.add_state(key="break", state=BaristaBreakState())
        self.set_ready_state()
        self.done_orders_counter = 0

    def set_ready_state(self):
        self.done_orders_counter = 0
        self.set_state(key="ready")

    def set_break_state(self):
        self.set_state(key="break")

    def handle_request(self, request: dict):
        if self.done_orders_counter < 3:
            self.current_state.handle_request(request)
            self.done_orders_counter += 1
        else:
            self.set_break_state()
            self.current_state.handle_request(request)
            self.set_ready_state()

    def __str__(self) -> str:
        return f"Barista: {self.name} - current state: {self.current_state}"

    def __repr__(self) -> str:
        return super().__str__()
