package org.example.AbstractFactory;

public class Main {

    public static void main(String[] args) {
        // Factory producer
        FactoryProducer factoryProducer = new FactoryProducer();

        // Getting luxury vehicle factory to get luxury vehicles
        VehicleFactory luxuryVehicleFactory = factoryProducer.getFactory("LUXURY");

        // Getting first Luxury vehicle
        Vehicle luxuryVehicle1 = luxuryVehicleFactory.getVehicle("1");

        luxuryVehicle1.getAverage();

    }
}
