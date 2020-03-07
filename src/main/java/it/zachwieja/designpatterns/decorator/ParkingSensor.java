package it.zachwieja.designpatterns.decorator;

public class ParkingSensor extends CarAccessoriesDecorator {

    private Car car;

    public ParkingSensor(Car car) {
        this.car = car;
    }

    @Override
    public float price() {
        return car.price() + 2000F;
    }

    @Override
    public String description() {
        return car.description() + " with parking sensor";
    }

}
