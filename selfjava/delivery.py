from abc import ABC, abstractmethod

class Delivery(ABC):
    @abstractmethod
    def deliver(self , order):
        pass
class BikeDelivery(Delivery):
    def deliver(self,order):
        print(f"Delivering {order} using Bike.")
class CarDelivery(Delivery):
    def deliver(self,order):
        print(f"Delivering {order} using Car.")
deliver = BikeDelivery()
deliver.deliver("Pizza")
deliver = CarDelivery()
deliver.deliver("Burger")