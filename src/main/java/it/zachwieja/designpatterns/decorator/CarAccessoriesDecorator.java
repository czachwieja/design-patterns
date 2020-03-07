package it.zachwieja.designpatterns.decorator;

public class CarAccessoriesDecorator extends Car {

    @Override
    public float price() {
        return 0;
    }

    @Override
    public String description() {
        return null;
    }
}
