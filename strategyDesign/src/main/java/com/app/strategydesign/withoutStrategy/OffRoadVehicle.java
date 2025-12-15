package com.app.strategydesign.withoutStrategy;

public class OffRoadVehicle extends Vehicle {
    // code duplicate from Sport Vehicle which is not there in parent
    public void drive(){
        System.out.println("sports drive function");
    }
}
