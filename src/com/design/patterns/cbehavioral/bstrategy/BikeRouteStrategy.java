package com.design.patterns.cbehavioral.bstrategy;

public class BikeRouteStrategy implements RouteStrategy{

	@Override
	public void buildRoute(String start, String end) {
		// TODO Auto-generated method stub
		System.out.println("Calculate fastest route by Bike from "+start+" to "+end);
	}

}
