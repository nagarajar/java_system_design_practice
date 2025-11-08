package com.design.patterns.cbehavioral.bstrategy;

public class CarRouteStrategy implements RouteStrategy{

	@Override
	public void buildRoute(String start, String end) {
		// TODO Auto-generated method stub
		System.out.println("Calculate fastest route by Car from "+start+" to "+end);
	}

}
