package org.example.AbstractFactory;

public class FactoryProducer {

    VehicleFactory getFactory(String input){
        switch (input){
            case "LUXURY": return new LuxuryVehicleFactory();
            case "NORMAL": return new NormalVehicleFactory();
            default: return null;
        }
    }
}
