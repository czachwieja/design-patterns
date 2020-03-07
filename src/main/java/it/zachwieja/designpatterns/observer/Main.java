package it.zachwieja.designpatterns.observer;

public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new Client1());
        subject.addObserver(new Client2());
        subject.startWork();
    }
}
