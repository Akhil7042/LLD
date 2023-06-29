package org.example.StratergyDesignPatterns.WithStratergyPattern;


import org.example.StratergyDesignPatterns.WithStratergyPattern.stratergy.SpottsDriveStratergy;

public class OffroadVehicle extends Vehicle{
    OffroadVehicle() {
        super(new SpottsDriveStratergy());
    }
}
