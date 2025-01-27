package it.zachwieja.designpatterns.singleton;

public class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public int getPullSize() {
        return 4;
    }
}