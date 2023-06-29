package org.example.AbstractFactory;

public class LuxuryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String input) {
        switch (input){
            case "1": return new LuxuryVehicle1();
            case "2": return new LuxuryVehicle1();
            default: return null;

        }
    }
}
