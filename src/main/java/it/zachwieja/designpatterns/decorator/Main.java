package it.zachwieja.designpatterns.decorator;

public class Main {

    public static void main(String[] args) {
        Car i20Car = new i20Car();
        System.out.println("i20 price: " + i20Car.price());
        System.out.println("i20 description: " + i20Car.description());
        System.out.println();

        Car i20CarWithArmrest = new Armrest(i20Car);
        System.out.println("i20CarWithArmrest price: " + i20CarWithArmrest.price());
        System.out.println("i20CarWithArmrest description: " + i20CarWithArmrest.description());
        System.out.println();

        Car i20CarWithArmrestAndParkingSensor = new ParkingSensor(i20CarWithArmrest);
        System.out.println("i20CarWithArmrestAndParkingSensor price: " + i20CarWithArmrestAndParkingSensor.price());
        System.out.println("i20CarWithArmrestAndParkingSensor description: " + i20CarWithArmrestAndParkingSensor.description());
        System.out.println();

        Car i20CarWithArmrestAndParkingSensorAndDoubleTires = new WinterTires(new WinterTires(i20CarWithArmrestAndParkingSensor));
        System.out.println("i20CarWithArmrestAndParkingSensorAndDoubleTires price: " + i20CarWithArmrestAndParkingSensorAndDoubleTires.price());
        System.out.println("i20CarWithArmrestAndParkingSensorAndDoubleTires description: " + i20CarWithArmrestAndParkingSensorAndDoubleTires.description());
        System.out.println();

    }

}
