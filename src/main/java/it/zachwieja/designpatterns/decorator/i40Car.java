package it.zachwieja.designpatterns.decorator;

public class i40Car extends Car {

    @Override
    public float price() {
        return 40000;
    }

    @Override
    public String description() {
        return "Hyundai i40";
    }

}
