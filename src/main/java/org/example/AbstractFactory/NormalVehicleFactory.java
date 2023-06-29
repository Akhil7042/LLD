package org.example.AbstractFactory;

public class NormalVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String input) {
        switch (input){
            case "1": return new NormalVehicle1();
            case "2": return new NormalVehicle2();
            default: return null;

        }
    }
}
