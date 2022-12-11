from car import Car
from account import Account

if __name__ == "__main__":
    car = Car("ADSA", Account("Andress", "DASWDW"))
    print(vars(car))
    print(vars(car.driver))