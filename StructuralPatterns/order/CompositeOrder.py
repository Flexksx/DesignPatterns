from menu.MenuItem import MenuItem
from order.Order import Order


class CompositeOrder():
    def __init__(self, orders: list[Order]):
        self.orders: list[Order] = orders

    def prepare(self):
        products: list[MenuItem] = []
        for order in self.orders:
            result = order.prepare()
            if isinstance(result, MenuItem):
                products.append(result)
            elif isinstance(result, list):
                for item in result:
                    products.append(item)
        return products
