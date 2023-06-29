package org.example.StratergyDesignPatterns.WithStratergyPattern;

import org.example.StratergyDesignPatterns.WithStratergyPattern.stratergy.DriveStratergy;
import org.example.StratergyDesignPatterns.WithStratergyPattern.stratergy.NormalDriveStratergy;

public class Vehicle {

    DriveStratergy driveStratergy; // has a relationship with DriveStratergy

    // Constructer injection of required stratergy
    Vehicle(DriveStratergy driveStratergy){
        this.driveStratergy = driveStratergy;
    }

    public void drive(){
        driveStratergy.drive();
    }

}
