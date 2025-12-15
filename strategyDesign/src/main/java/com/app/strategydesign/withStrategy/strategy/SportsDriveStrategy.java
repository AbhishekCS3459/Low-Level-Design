package com.app.strategydesign.withStrategy.strategy;
import com.app.strategydesign.withStrategy.strategy.DriveStrategy;
public class SportsDriveStrategy implements DriveStrategy {
    public void drive() {
        System.out.println("sports drive function");
    }
}
