package com.app.strategydesign;

import com.app.strategydesign.withStrategy.GoodsVehicle;
import com.app.strategydesign.withStrategy.OffRoadVehicle;
import com.app.strategydesign.withStrategy.SportsVehicle;
import com.app.strategydesign.withStrategy.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyDesignApplication {
/*
Implement the strategy design when the multiple children of a parent have the same code that is not present in the
parent class, to avoid the code duplication we can use this design pattern.
like if you see without strategy code we have duplicate code over different children so we have implemented that.
 */
	public static void main(String[] args) {
	Vehicle vehicle=new GoodsVehicle(); // this will implement the Goods Vehicle Drive strategy
		vehicle=new SportsVehicle(); // this will implement the Sports Vehicle Drive Strategy
		vehicle=new OffRoadVehicle();// this will implement the Offroad Vehicle Drive strategy
		vehicle.drive();
	}

}
