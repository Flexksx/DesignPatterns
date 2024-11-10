from abc import ABC, abstractmethod


class Order:
    @abstractmethod
    def prepare(self):
        pass
