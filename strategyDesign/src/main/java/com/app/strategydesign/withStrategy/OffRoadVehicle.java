package com.app.strategydesign.withStrategy;
import com.app.strategydesign.withStrategy.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
