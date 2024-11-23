from employee.Employee import Employee
from employee.EmployeeState import EmployeeState


class Barista(Employee):
    def __init__(self, name: str = None) -> None:
        super().__init__(name)
