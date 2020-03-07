package it.zachwieja.designpatterns.decorator;

public class WinterTires extends CarAccessoriesDecorator {

    private Car car;

    public WinterTires(Car car) {
        this.car = car;
    }

    @Override
    public float price() {
        return car.price() + 800F;
    }

    @Override
    public String description() {
        return car.description() + " with winter tires";
    }


}
