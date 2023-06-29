package org.example.StratergyDesignPatterns.WithStratergyPattern.stratergy;

public class NormalDriveStratergy implements DriveStratergy{
    @Override
    public void drive() {
        System.out.println("Normal drive capability");
    }
}
