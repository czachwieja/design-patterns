package it.zachwieja.designpatterns.factory;

public class Main {

    public static void main(String[] args) {

        Ship cargoShip = ShipFactory.createShip(ShipType.CARGO_SHIP);
        System.out.println(cargoShip);

        Ship transportShip = ShipFactory.createShip(ShipType.TRANSPORT_SHIP);
        System.out.println(transportShip);

//        Ship cargoShipWithSpace = ShipFactory.createShip("CargoShipWithAdditionalSpace");
//        System.out.println(cargoShipWithSpace);

    }
}
