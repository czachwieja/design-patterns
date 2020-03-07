package it.zachwieja.designpatterns.factory;

public class ShipFactory {

    public static Ship createShip(ShipType ship) {
        if (ShipType.CARGO_SHIP == ship) {
            CargoShip cargoShip = new CargoShip();
            cargoShip.setCargoLimit(100);
            cargoShip.setTeammates(10);
            return cargoShip;
//            case "CargoShipWithAdditionalSpace":
//                CargoShip cargoShipWithAdditionalSpace = new CargoShip();
//                cargoShipWithAdditionalSpace.setCargoLimit(200);
//                cargoShipWithAdditionalSpace.setTeammates(12);
//                return cargoShipWithAdditionalSpace;
        } else if (ShipType.TRANSPORT_SHIP == ship) {
            return new TransportShip();
        } else if (ShipType.WAR_SHIP == ship) {
            return new WarShip();
        }
        return null;
    }

}
