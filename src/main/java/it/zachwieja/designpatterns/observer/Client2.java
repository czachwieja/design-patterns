package it.zachwieja.designpatterns.observer;

public class Client2 implements Observer {

    @Override
    public void update() {
        System.out.println("Koniec pracy!!!" + this.getClass().getName());
    }

}
