package com.app.strategydesign.withStrategy.strategy;

public class NormalDriveStrategy implements DriveStrategy {
    public void drive() {
        System.out.println("normal drive function");
    }
}
