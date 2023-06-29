package org.example.StratergyDesignPatterns.WithStratergyPattern;


import org.example.StratergyDesignPatterns.WithStratergyPattern.stratergy.NormalDriveStratergy;

public class NormalVehicle extends Vehicle{
    NormalVehicle() {
        super(new NormalDriveStratergy());
    }
}
