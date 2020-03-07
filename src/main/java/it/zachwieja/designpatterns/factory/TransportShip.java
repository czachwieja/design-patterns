package it.zachwieja.designpatterns.factory;

public class TransportShip extends Ship {
    @Override
    public void flowSpeed() {
        System.out.println("Speed: 15");
    }

    @Override
    public String toString() {
        return "Speed 15";
    }
}
