package com.app.strategydesign.withStrategy;
import com.app.strategydesign.withStrategy.strategy.DriveStrategy;

public class Vehicle  {
    DriveStrategy driveStrategy;
    Vehicle (DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
    public void drive() {
        driveStrategy.drive();
    }
}
