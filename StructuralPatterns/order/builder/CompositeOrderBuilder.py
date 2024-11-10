from order.Order import Order
from order.CompositeOrder import CompositeOrder


class CompositeOrderBuilder:
    def __init__(self):
        self.orders = []

    def add_order(self, order: Order):
        self.orders.append(order)
        return self

    def build(self):
        return CompositeOrder(self.orders)
