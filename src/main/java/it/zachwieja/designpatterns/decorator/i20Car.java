package it.zachwieja.designpatterns.decorator;

public class i20Car extends Car {

    @Override
    public float price() {
        float basePrice = 20000;

        return basePrice;
    }

    @Override
    public String description() {
        return "Hyundai i20";
    }

}
