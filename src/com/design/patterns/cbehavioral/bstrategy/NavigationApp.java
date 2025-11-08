package com.design.patterns.cbehavioral.bstrategy;

public class NavigationApp {
	private RouteStrategy routeStrategy;
	
	public void setRouteStrategy(RouteStrategy routeStrategy) {
		this.routeStrategy = routeStrategy;
	}
	
	public void navigate(String start, String end) {
		if(routeStrategy == null) {
			System.out.println("Navigation mode not selected.");
		} else {
			routeStrategy.buildRoute(start, end);
		}
	}
}
