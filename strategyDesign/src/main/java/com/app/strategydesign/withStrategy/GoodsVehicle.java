package com.app.strategydesign.withStrategy;

import com.app.strategydesign.withStrategy.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
