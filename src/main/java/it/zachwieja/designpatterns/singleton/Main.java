package it.zachwieja.designpatterns.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getPullSize());

        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
        System.out.println(singleton2.getPullSize());
    }

}
