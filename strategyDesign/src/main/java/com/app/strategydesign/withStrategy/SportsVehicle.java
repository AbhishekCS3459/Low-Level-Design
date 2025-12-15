package com.app.strategydesign.withStrategy;

import com.app.strategydesign.withStrategy.strategy.DriveStrategy;
import com.app.strategydesign.withStrategy.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
