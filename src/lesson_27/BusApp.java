package lesson_27;

import javax.swing.*;

public class BusApp {
    public static void main(String[] args) {

        BusDriver driver = new BusDriver("Peter", "LN-12345");

        Bus bus = new Bus(driver, 4);

        System.out.println(bus.toString());

        Passenger pass1 = new Passenger("John");
        Passenger pass2 = new Passenger("Max");
        Passenger pass3 = new Passenger("Hanna");
        Passenger pass4 = new Passenger("Luisa");
        Passenger pass5 = new Passenger("Passenger");

        bus.takePassenger(pass1);
        bus.takePassenger(pass2);
        bus.takePassenger(pass3);
        bus.takePassenger(pass4);
        bus.takePassenger(pass5);

        bus.showListPassengers();

        System.out.println("dropPassenger(pass4)" + bus.dropPassenger(pass4));
        System.out.println("dropPassenger(pass2)" + bus.dropPassenger(pass2));
        bus.showListPassengers();

        bus.takePassenger(pass1);
        bus.takePassenger(pass4);
        System.out.println("bus.takePassenger(pass4)" + bus.takePassenger(pass4));
        bus.showListPassengers();
        bus.getCountPassengers();

        System.out.println(bus.toString());

    }
}
