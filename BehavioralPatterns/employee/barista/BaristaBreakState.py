from employee.EmployeeState import EmployeeState
import time
from tqdm import tqdm


class BaristaBreakState(EmployeeState):
    def __init__(self) -> None:
        super().__init__()
        self.name = "Break"

    def handle_request(self, request: dict):
        if request["request"] == "order":
            print("""
⣿⣿⣿⣿⣿⣿⣿⠿⠿⢛⣋⣙⣋⣩⣭⣭⣭⣭⣍⣉⡛⠻⢿⣿⣿⣿⣿
⣿⣿⣿⠟⣋⣥⣴⣾⣿⣿⣿⡆⣿⣿⣿⣿⣿⣿⡿⠟⠛⠗⢦⡙⢿⣿⣿
⣿⡟⡡⠾⠛⠻⢿⣿⣿⣿⡿⠃⣿⡿⣿⠿⠛⠉⠠⠴⢶⡜⣦⡀⡈⢿⣿
⡿⢀⣰⡏⣼⠋⠁⢲⡌⢤⣠⣾⣷⡄⢄⠠⡶⣾⡀⠀⣸⡷⢸⡷⢹⠈⣿
⡇⢘⢿⣇⢻⣤⣠⡼⢃⣤⣾⣿⣿⣿⢌⣷⣅⡘⠻⠿⢛⣡⣿⠀⣾⢠⣿
⣷⠸⣮⣿⣷⣨⣥⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢁⡼⠃⣼⣿  BRO GIMME A BREAK
⣿⡆⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢃⡞⣱⠆⣿⣿
⣿⣿⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⣼⢸⡿⢸⣿⣿
⣿⣿⡇⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢿⡌⠃⣿⣿⣿
⣿⣿⣿⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢻⣿⣿⣷⢸⣷⠀⣿⣿⣿
⣿⣿⣿⡇⢻⣿⣿⣿⡿⠿⠿⣿⣿⣿⠿⠟⣡⡈⠻⣿⣿⣿⣿⢠⣿⣿⣿
⣿⣿⣿⣿⠘⣿⣿⣿⣿⣦⣙⣛⣛⣛⣋⠷⠙⢿⣷⣌⠛⢿⡇⣼⣿⣿⣿
⣿⣿⣿⡿⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⡙⢿⢗⣀⣁⠈⢻⣿⣿
⣿⡿⢋⣴⣿⣎⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡉⣯⣿⣷⠆⠙⢿
⣏⠀⠈⠧⢡⠉⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠉⢉⣁⣀⣀⣾          
     """)
            iterations = 100
            duration = 2
            interval = duration / iterations

            for _ in tqdm(range(iterations), desc="Taking a Break", ncols=100):
                time.sleep(interval)

        else:
            print("Barista is on break")

    def __str__(self) -> str:
        return f"Barista state: {self.name}"

    def __repr__(self) -> str:
        return self.__str__()
