package it.zachwieja.designpatterns.decorator;


public class i30Car extends Car {

    @Override
    public float price() {
        return 30000;
    }

    @Override
    public String description() {
        return "Hyundai i30";
    }

}
