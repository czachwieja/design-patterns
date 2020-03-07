package it.zachwieja.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observers) {
        this.observers.add(observers);
    }

    public void startWork() {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                for (Observer observer : observers) {
                    observer.update();
                }
            }
        });
        thread.start();


    }


}
