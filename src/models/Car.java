package models;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Car is going to start");
    }

    private void startElectricity() {
        System.out.println("Electricity is working properly.");
    }

    private void startCommand() {
        System.out.println("Command system has been downloaded.");
    }

    private void startFuelSystem() {
        System.out.println("Fuel system is full.");
    }
}
