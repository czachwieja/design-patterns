package it.zachwieja.designpatterns.factory;

public class CargoShip extends Ship {

    @Override
    public void flowSpeed() {
        System.out.println("Speed: 10");
    }

    private int cargoLimit;
    private int teammates;

    public int getCargoLimit() {
        return cargoLimit;
    }

    public void setCargoLimit(int cargoLimit) {
        this.cargoLimit = cargoLimit;
    }

    public int getTeammates() {
        return teammates;
    }

    public void setTeammates(int teammates) {
        this.teammates = teammates;
    }

    @Override
    public String toString() {
        flowSpeed();
        return "CargoShip{" +
                "cargoLimit=" + cargoLimit +
                ", teammates=" + teammates +
                '}';
    }

}
