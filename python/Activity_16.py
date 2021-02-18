class Car:
    def __init__(c, manufacturer, model, make, transmission, color):
        c.manufacturer = manufacturer
        c.model = model
        c.make = make
        c.transmission = transmission
        c.color = color

    def accelerate(c):
        print(c.manufacturer + " " + c.model + " has started moving")

    def stop(c):
        print(c.manufacturer + " " + c.model + " has stopped moving")

c1 = Car("Honda", "City", "2012", "Manual", "White")
c2 = Car("Maruti", "Alto", "2016", "Manual", "Silver")
c3 = Car("Hyundai", "i20", "2019", "Automatic", "Red")

c2.accelerate()
c3.stop()